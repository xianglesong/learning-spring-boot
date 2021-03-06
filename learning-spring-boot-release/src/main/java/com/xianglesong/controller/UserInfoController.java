package com.xianglesong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xianglesong.entity.UserInfo;
import com.xianglesong.repository.UserInfoRepository;
import com.xianglesong.service.UserInfoService;

@RestController
public class UserInfoController {

  @Autowired
  UserInfoService userInfoService;

  // http://localhost:8080/getUsers?username=test&password=pwd
  @RequestMapping("/getUsers")
  public List<UserInfo> getUsers(HttpServletRequest request, HttpServletResponse response) {

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    List<UserInfo> users = userInfoService.findByQ(username, password);
    // users = userInfoRepository.findAll();
    return users;
  }


}
