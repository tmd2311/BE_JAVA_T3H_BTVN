package vn.com.claim.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import vn.com.claim.entity.UserEntity;
import vn.com.claim.repository.UserRepository;
import vn.com.claim.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<UserEntity> getAllUsers() {
    return userRepository.findAll();
  }
}
