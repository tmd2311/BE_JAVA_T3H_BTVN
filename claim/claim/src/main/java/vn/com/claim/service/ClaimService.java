package vn.com.claim.service;

import java.util.List;
import vn.com.claim.dto.ClaimDTO;

public interface ClaimService {
  List<ClaimDTO> findAll();

}
