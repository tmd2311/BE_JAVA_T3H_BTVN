package com.example.antino.service.impl;

import com.example.antino.dao.IUserDao;
import com.example.antino.dao.impl.UserDaoImpl;
import com.example.antino.model.UserModel;
import com.example.antino.service.IUserService;
import java.util.List;

public class UserServiceImpl implements IUserService {

  private IUserDao userDao;
  public UserServiceImpl() {
    userDao = new UserDaoImpl();
  }
  @Override
  public List<UserModel> getListUser() {
    return userDao.getUsers();
  }
}
