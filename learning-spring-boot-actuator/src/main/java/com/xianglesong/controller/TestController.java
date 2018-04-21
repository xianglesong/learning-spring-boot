package com.xianglesong.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  public static final Logger logger = LoggerFactory.getLogger(TestController.class);

  @Value("${spring.boot.corp.name}")
  private String corpName;

  @RequestMapping(value = "/api/test/{user}", method = RequestMethod.GET)
  public String testOne(@PathVariable String user) {
    System.out.println(System.currentTimeMillis());
    String result = "result: " + user + " and corp name: " + corpName;
    logger.info("result {}", result);
//    logger.error("exp", new RuntimeException("re"));
    return result;
  }

}
