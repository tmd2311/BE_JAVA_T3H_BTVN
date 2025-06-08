package vn.com.claim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "claim")
@Data
public class Claim extends BaseEntity {
  private double amount;
  private Date claimDate;
  private String code;
  private String description;

  @ManyToOne
  @JoinColumn(name = "status_id")
  private ClaimStatus status;


  @ManyToOne
  @JoinColumn(name = "product_id")
  private InsuranceProduct insuranceProduct;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;
}
