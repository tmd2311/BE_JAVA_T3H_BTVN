package vn.com.claim.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Pageable;
import vn.com.claim.dto.ClaimDTO;
import vn.com.claim.dto.request.ClaimRequest;
import vn.com.claim.dto.response.Response;
import vn.com.claim.dto.response.ResponsePage;

public interface ClaimService {
  ResponsePage<List<ClaimDTO>> getClaims(String claimCode, LocalDate fromDateClaim, LocalDate toDateClaim, String codeStatus, Pageable pageable);

  Response<String> createClaim(ClaimRequest claimRequest);
}
