package com.xianglesong.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  public static final Logger logger = LoggerFactory.getLogger(TestController.class);

  @RequestMapping(value = "/api/test/{user}", method = RequestMethod.GET)
  public String testOne(@PathVariable String user) {
    System.out.println(System.currentTimeMillis());
    String result = "result: " + user;
    logger.info("result {}", result);
    int x = 0;
    int y = 1/x;
    // logger.error("exp", new RuntimeException("re"));
    return result;
  }

}
