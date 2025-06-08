package vn.com.claim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "claim_document")
@Data
public class ClaimDocument extends BaseEntity {
  private String documentName;
  private String documentType;
  private String filePath;
  private Date uploadDate;

  @ManyToOne
  @JoinColumn(name = "claim_id")
  private Claim claim;

}
