package com.xianglesong.service;


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
}
