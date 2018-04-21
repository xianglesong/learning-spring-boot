package com.xianglesong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianglesong.entity.UserInfoEntity;
import com.xianglesong.mapper.UserInfoMapper;

@Service
public class UserInfoService {

  @Autowired
  UserInfoMapper userMapper;

  public List<UserInfoEntity> getAll() {
    return userMapper.getAll();
  }

}
