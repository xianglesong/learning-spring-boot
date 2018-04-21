package com.xianglesong.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianglesong.entity.UserInfo;
import com.xianglesong.repository.UserInfoRepository;

@Service
public class UserInfoService {

  @Autowired
  UserInfoRepository userInfoRepository;

  public void save(UserInfo userInfo) {
    userInfoRepository.save(userInfo);
  }

  public List<UserInfo> findByQ(String username, String password) {
    return userInfoRepository.findByQ(username, password);
  }

}
