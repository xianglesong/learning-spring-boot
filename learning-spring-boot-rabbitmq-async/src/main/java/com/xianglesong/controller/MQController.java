package com.xianglesong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xianglesong.rabbitmq.MQSend;

@RestController
public class MQController {

  public static final Logger logger = LoggerFactory.getLogger(MQController.class);

  @Autowired
  MQSend mqSend;

  @RequestMapping(value = "/api/mq", method = RequestMethod.GET)
  public String redisTest(HttpServletRequest request, HttpServletResponse response) {
    String key = request.getParameter("key");
    System.out.println(System.currentTimeMillis());
    mqSend.sendMsg("key is: " + key);
    return key;
  }

}
