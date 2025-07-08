package vn.com.claim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "claim_document")
@Data
@Getter
@Setter
public class ClaimDocumentEntity extends BaseEntity {

    private String documentName;
    private String documentType;
    private String filePath;
    private LocalDate updateDate;

    @ManyToOne
    @JoinColumn(name = "claim_id")
    private ClaimEntity claimEntity;

    @Override
    public int hashCode() {
        return Objects.hashCode(documentName);
    }


}
