package vn.com.claim.controller.resource;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.claim.dto.ClaimDTO;
import vn.com.claim.service.ClaimService;

@RestController
@RequestMapping("/api/v1/claim")
public class ClaimResource {
  private final ClaimService claimService;

  public ClaimResource(ClaimService claimService) {
    this.claimService = claimService;
  }

  @GetMapping
  public ResponseEntity<List<ClaimDTO>> getAllClaims() {
    List<ClaimDTO> claimDTOS = claimService.findAll();
    if (claimDTOS.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    return ResponseEntity.status(HttpStatus.OK).body(claimDTOS );
  }
}
