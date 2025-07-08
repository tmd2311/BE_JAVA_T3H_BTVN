package vn.com.claim.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.event.DocumentEvent;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vn.com.claim.dto.ClaimDTO;
import vn.com.claim.dto.request.ClaimRequest;
import vn.com.claim.dto.request.CustomerRequest;
import vn.com.claim.dto.request.DocumentRequest;
import vn.com.claim.dto.response.Response;
import vn.com.claim.dto.response.ResponsePage;
import vn.com.claim.entity.ClaimDocumentEntity;
import vn.com.claim.entity.ClaimEntity;
import vn.com.claim.entity.ClaimStatusEntity;
import vn.com.claim.entity.CustomerEntity;
import vn.com.claim.entity.InsuranceProductEntity;
import vn.com.claim.mapper.ClaimMapper;
import vn.com.claim.repository.ClaimRepository;
import vn.com.claim.repository.ClaimStatusRepository;
import vn.com.claim.repository.CustomerRepository;
import vn.com.claim.repository.InsuranceProductEntityRepository;
import vn.com.claim.service.ClaimService;
import vn.com.claim.utils.Constants;
import vn.com.claim.utils.Constants.STATUS_CODE;

@Service
public class ClaimServiceImpl implements ClaimService {

  @Value("${file.root.folder}")
  private String fileRootFolder;
  @Value("${file.document}")
  private String forderDocument;


  private final ClaimRepository claimRepository;
  private final ClaimMapper claimMapper;
  private final ClaimStatusRepository claimStatusRepository;
  private final CustomerRepository customerRepository;
  private final InsuranceProductEntityRepository productEntityRepository;

  public ClaimServiceImpl(ClaimRepository claimRepository, ClaimMapper claimMapper,
      ClaimStatusRepository claimStatusRepository, CustomerRepository customerRepository,
      InsuranceProductEntityRepository productEntityRepository) {
    this.claimRepository = claimRepository;
    this.claimMapper = claimMapper;
    this.claimStatusRepository = claimStatusRepository;
    this.customerRepository = customerRepository;
    this.productEntityRepository = productEntityRepository;
  }

  @Override
  public ResponsePage<List<ClaimDTO>> getClaims(String claimCode, LocalDate fromDate, LocalDate toDate, String codeStatus, Pageable pageable) {
    if (StringUtils.isEmpty(claimCode)) {
      claimCode = null;
    }
    if (StringUtils.isEmpty(codeStatus)) {
      codeStatus = null;
    }
    Page<ClaimEntity> claimEntityPage = claimRepository.findByCondition(claimCode, fromDate, toDate, codeStatus, pageable);
    List<ClaimDTO> claimDTOS = claimMapper.toDtos(claimEntityPage.getContent());
    ResponsePage<List<ClaimDTO>> responsePage = new ResponsePage<>();
    responsePage.setData(claimDTOS);
    responsePage.setPageIndex(pageable.getPageNumber());
    responsePage.setPageSize(pageable.getPageSize());
    responsePage.setTotalElement(claimEntityPage.getTotalElements());
    responsePage.setTotalPage(claimEntityPage.getTotalPages());
    responsePage.setCode(HttpStatus.OK.value());
    responsePage.setMessage("success");
    return responsePage;
  }

  @Override
  public Response<String> createClaim(ClaimRequest claimRequest) {
    ClaimEntity claimEntity = prepareClaimEntity(claimRequest);
    CustomerEntity customerEntity = findOrCreateCustomer(claimRequest.getCustomer(), claimEntity);
    InsuranceProductEntity productEntity = findInsuranceProduct(claimRequest.getNameProduct());
    claimEntity.setInsuranceProductEntity(productEntity);

    Set<ClaimDocumentEntity> documents = handleDocuments(claimRequest.getDocuments(), claimEntity);
    claimEntity.setClaimDocumentEntity(documents);

    customerRepository.save(customerEntity);

    return buildSuccessResponse(claimEntity.getCode());
  }

  private ClaimEntity prepareClaimEntity(ClaimRequest claimRequest) {
    ClaimEntity claimEntity = new ClaimEntity();
    claimEntity.setAmount(claimRequest.getAmount());
    claimEntity.setClaimDate(
        claimRequest.getClaimDate() != null ? claimRequest.getClaimDate() : LocalDate.now()
    );
    claimEntity.setDescription(claimRequest.getDescription());

    long totalClaim = claimRepository.count();
    String generatedCode = Constants.createCodeClaim(totalClaim);
    claimEntity.setCode(generatedCode);

    ClaimStatusEntity status = claimStatusRepository.findByCode(STATUS_CODE.NEW.name());
    claimEntity.setClaimStatusEntity(status);

    return claimEntity;
  }

  private CustomerEntity findOrCreateCustomer(CustomerRequest customerRequest, ClaimEntity claimEntity) {
    CustomerEntity customerEntity = customerRepository.findByPhoneAndEmail(
        customerRequest.getPhoneNumber(),
        customerRequest.getEmail()
    );

    if (customerEntity == null) {
      customerEntity = new CustomerEntity();
      customerEntity.setPhoneNumber(customerRequest.getPhoneNumber());
      customerEntity.setEmail(customerRequest.getEmail());
      customerEntity.setName(customerRequest.getName());
      customerEntity.setAddress(customerRequest.getAddress());
      customerEntity.setBankName(customerRequest.getBankName());
      customerEntity.setBankNumber(customerRequest.getBankNumber());
      customerEntity.setClaims(new ArrayList<>());
    }

    customerEntity.getClaims().add(claimEntity);
    claimEntity.setCustomerEntity(customerEntity);

    return customerEntity;
  }

  private InsuranceProductEntity findInsuranceProduct(String productName) {
    return productEntityRepository.findByName(productName);
  }

  private Set<ClaimDocumentEntity> handleDocuments(List<DocumentRequest> documents, ClaimEntity claimEntity) {
    Set<ClaimDocumentEntity> claimDocumentEntities = new HashSet<>();

    for (DocumentRequest document : documents) {
      String strBase64 = document.getFileBase64Encoded();
      if (strBase64.contains(",")) {
        strBase64 = strBase64.split(",")[1];
      }

      byte[] bytes = Base64.getDecoder().decode(strBase64);
      String extension = "." + document.getDocumentType();
      String fileName = claimEntity.getCode() + "_" + document.getDocumentName() + extension;

      String folderPath = fileRootFolder + forderDocument;
      File folder = new File(folderPath);
      if (!folder.exists()) {
        folder.mkdirs();
      }

      String filePath = folderPath + fileName;
      File file = new File(filePath);

      try (FileOutputStream fos = new FileOutputStream(file)) {
        fos.write(bytes);
      } catch (IOException e) {
        throw new RuntimeException("Lỗi ghi file: " + filePath, e);
      }

      ClaimDocumentEntity documentEntity = new ClaimDocumentEntity();
      documentEntity.setClaimEntity(claimEntity);
      documentEntity.setDocumentName(document.getDocumentName());
      documentEntity.setDocumentType(document.getDocumentType());
      documentEntity.setFilePath(filePath);
      documentEntity.setUpdateDate(document.getUpdateDate());

      claimDocumentEntities.add(documentEntity);
    }

    return claimDocumentEntities;
  }

  private Response<String> buildSuccessResponse(String claimCode) {
    Response<String> response = new Response<>();
    response.setCode(HttpStatus.OK.value());
    response.setMessage("Success full");
    response.setData(claimCode);
    return response;
  }


}
