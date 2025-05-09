package com.example.antino.dao;

import com.example.antino.model.UserModel;
import java.util.List;

public interface IUserDao {

  List<UserModel> getUsers();
}