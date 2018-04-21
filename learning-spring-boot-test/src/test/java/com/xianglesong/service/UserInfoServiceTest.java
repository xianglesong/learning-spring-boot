package com.xianglesong.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xianglesong.entity.UserInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoServiceTest {

  @Autowired
  UserInfoService userInfoService;

  @Test
  public void testUserInfo() {
    String username = "test";
    String password = "pwd";

    List<UserInfo> users = userInfoService.findByQ(username, password);

    assertTrue(users != null);
    System.out.println("test .");
  }
}
