package com.example.antino.controller;

import com.example.antino.model.UserModel;
import com.example.antino.service.IUserService;
import com.example.antino.service.impl.UserServiceImpl;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
  private IUserService userService;

  @Override
  public void init(ServletConfig config) throws ServletException {
    userService = new UserServiceImpl();  
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<UserModel> userModelsDatabase = userService.getListUser();
    req.setAttribute("userModels", userModelsDatabase);
    req.getRequestDispatcher("/pages/user.jsp").forward(req, resp);
  }
}
