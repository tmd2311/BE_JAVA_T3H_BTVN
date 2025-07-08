package vn.com.claim.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false, exclude = {
    "claimStatusEntity","customerEntity","insuranceProductEntity", "claimDocumentEntity"
})
@Entity
@Table(name = "claim")
@Data
@Getter
@Setter
public class ClaimEntity extends BaseEntity{

    private Double amount;
    private LocalDate claimDate;
    private String code;
    private String description;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private ClaimStatusEntity claimStatusEntity;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private InsuranceProductEntity insuranceProductEntity;

    @OneToMany(mappedBy = "claimEntity" ,cascade = CascadeType.ALL)
    private Set<ClaimDocumentEntity> claimDocumentEntity;


    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
