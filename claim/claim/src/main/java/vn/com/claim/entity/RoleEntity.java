package vn.com.claim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Objects;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "roles")
@Data
@Getter
@Setter
public class RoleEntity extends BaseEntity {

    private String name;
    private String code;

    @ManyToMany(mappedBy = "roles")
    private Set<UserEntity> users;

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
