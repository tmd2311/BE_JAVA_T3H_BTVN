package vn.com.claim.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vn.com.claim.dto.ClaimDTO;
import vn.com.claim.entity.ClaimEntity;

@Mapper(componentModel = "spring")
public interface ClaimMapper {

    @Mapping(source = "customerEntity.name",target = "customerName")
    @Mapping(source = "insuranceProductEntity.name",target = "nameProduct")
    @Mapping(source = "insuranceProductEntity.coverage",target = "coverageProduct")
    @Mapping(source = "claimStatusEntity.description",target = "statusName")
    @Mapping(source = "claimStatusEntity.code",target = "statusCode")
    ClaimDTO toDto(ClaimEntity claimEntity);

    List<ClaimDTO> toDtos(List<ClaimEntity> claimEntityList);

}
