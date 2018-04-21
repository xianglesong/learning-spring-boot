package com.xianglesong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Value("${spring.boot.corp.name}")
  private String corpName;

  @RequestMapping(value = "/api/test/{user}", method = RequestMethod.GET)
  public String testOne(@PathVariable String user) {
    System.out.println(System.currentTimeMillis());
    String result = "result: " + user + " and corp name: " + corpName;
    return result;
  }

}
