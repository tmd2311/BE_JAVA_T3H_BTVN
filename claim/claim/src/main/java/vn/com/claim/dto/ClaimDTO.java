package vn.com.claim.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClaimDTO {
  private String code;
  private String customerName;
  private String insuranceProductName;
  private Date claimDate;
  private String description;
  private String status;


}
