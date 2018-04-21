package com.xianglesong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xianglesong.dao.RedisDao;

@RestController
public class RedisController {

  public static final Logger logger = LoggerFactory.getLogger(RedisController.class);

  @Autowired
  RedisDao redisDao;

  @RequestMapping(value = "/api/redis", method = RequestMethod.GET)
  public String redisTest(HttpServletRequest request, HttpServletResponse response) {
    String key = request.getParameter("key");
    System.out.println(System.currentTimeMillis());
    
    return redisDao.getValue(key);
  }

}
