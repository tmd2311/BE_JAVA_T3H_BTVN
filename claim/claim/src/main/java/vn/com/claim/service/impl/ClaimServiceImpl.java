package vn.com.claim.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import vn.com.claim.dto.ClaimDTO;
import vn.com.claim.repository.ClaimRepository;
import vn.com.claim.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {

  private final ClaimRepository claimRepository;

  public ClaimServiceImpl(ClaimRepository claimRepository) {
    this.claimRepository = claimRepository;
  }

  @Override
  public List<ClaimDTO> findAll() {
    return claimRepository.findAllClaimsDTOs();
  }
}
