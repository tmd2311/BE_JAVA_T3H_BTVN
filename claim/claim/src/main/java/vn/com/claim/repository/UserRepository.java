package vn.com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.claim.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
