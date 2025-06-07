package vn.com.claim.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  private LocalDateTime createdDate;
  private LocalDateTime lastmodifiedDate;
  private String createdBy;
  private String lastmodifiedBy;
  private Boolean deleted;


}
