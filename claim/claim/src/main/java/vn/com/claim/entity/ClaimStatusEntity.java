package vn.com.claim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "claim_status")
@Data
@Getter
@Setter
public class ClaimStatusEntity extends BaseEntity{

    private String code;
    private String description;

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
