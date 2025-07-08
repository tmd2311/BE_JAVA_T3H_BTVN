package vn.com.claim.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "insurance_product")
@Data
@Getter
@Setter
public class InsuranceProductEntity extends BaseEntity {

    private String coverage;

    private String description;

    @Column(unique = true)
    private String name;

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
