package vn.com.claim.controller.resource;

import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.com.claim.dto.ClaimDTO;
import vn.com.claim.dto.request.ClaimRequest;
import vn.com.claim.dto.response.Response;
import vn.com.claim.dto.response.ResponsePage;
import vn.com.claim.service.ClaimService;

@RestController
@RequestMapping("/api/v1/claim")
@RequiredArgsConstructor
public class ClaimResource {
  private final ClaimService claimService;

  @GetMapping
  public ResponseEntity<ResponsePage<List<ClaimDTO>>> getListClaim(
      @RequestParam(required = false) String claimCode,
      @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
      @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate,
      @RequestParam(required = false) String codeStatus,
      Pageable pageable
  ) {
    ResponsePage<List<ClaimDTO>> responsePage = claimService.getClaims(claimCode, fromDate, toDate, codeStatus, pageable);
    return ResponseEntity.ok(responsePage);
  }

  @PostMapping("/create")
  public ResponseEntity<?> createdClaim(@RequestBody ClaimRequest claimRequest){
    Response<String> response = claimService.createClaim(claimRequest);
    return ResponseEntity.ok(response);
  }
}
