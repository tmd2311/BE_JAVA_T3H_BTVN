package vn.com.claim.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import vn.com.claim.dto.UserDTO;
import vn.com.claim.entity.UserEntity;

@Mapper(componentModel = "spring")
//@DecoratedWith(UserMapperImpl.class)
public interface UserMapper {

    UserDTO toDto(UserEntity userEntity);

    List<UserDTO> toDto(List<UserEntity> userEntities);
}
