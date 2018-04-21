package com.xianglesong.servlet;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class MyListener implements ServletContextListener {

  private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MyListener.class);

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    logger.info("contextInitialized start");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    logger.info("contextInitialized end");
  }


}
