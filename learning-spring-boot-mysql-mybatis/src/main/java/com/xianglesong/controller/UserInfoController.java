package com.xianglesong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xianglesong.entity.UserInfoEntity;
import com.xianglesong.service.UserInfoService;

@RestController
public class UserInfoController {

  @Autowired
  UserInfoService userInfoService;

  // http://localhost:8080/getUsers?username=test&password=pwd
  @RequestMapping("/getAll")
  public List<UserInfoEntity> getAll(HttpServletRequest request, HttpServletResponse response) {

    List<UserInfoEntity> users = userInfoService.getAll();
    // users = userInfoRepository.findAll();
    return users;
  }


}
