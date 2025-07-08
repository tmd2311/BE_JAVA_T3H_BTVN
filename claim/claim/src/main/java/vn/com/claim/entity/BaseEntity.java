package vn.com.claim.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import vn.com.claim.utils.Constants;
import vn.com.claim.utils.Constants.SYSTEM;

@MappedSuperclass
@Data
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private LocalDateTime createdDate  = LocalDateTime.now();
    private LocalDateTime lastModifiedDate =    LocalDateTime.now();
    private String createdBy = SYSTEM.ADMIN.toString();
    private String lastModifiedBy = Constants.SYSTEM.ADMIN.toString();
    private Boolean deleted = Boolean.FALSE;



}
