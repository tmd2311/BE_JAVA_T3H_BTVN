package vn.com.claim.dto;

import lombok.Data;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ClaimDTO {
  private String code;
  private String customerName;
  private String nameProduct;
  private LocalDate claimDate;
  private String coverageProduct;
  private String statusName;
  private String statusCode;

}
