package vn.com.claim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "insurance_product")
@Data
public class InsuranceProduct extends BaseEntity {
  private String converage;
  private String name;
  private String description;

}
