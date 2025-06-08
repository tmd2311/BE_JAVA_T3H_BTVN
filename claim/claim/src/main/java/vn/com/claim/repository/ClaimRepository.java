package vn.com.claim.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.com.claim.dto.ClaimDTO;
import vn.com.claim.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

  @Query("""
        SELECT new vn.com.claim.dto.ClaimDTO(
            c.code, cu.name, p.name, c.claimDate, c.description, s.description
        )
        FROM Claim c
        JOIN c.customer cu
        JOIN c.insuranceProduct p
        JOIN c.status s
    """)
  List<ClaimDTO> findAllClaimsDTOs();

}
