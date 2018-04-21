package com.xianglesong.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TraceFilter implements Filter {
  private static final Logger logger = LoggerFactory.getLogger(TraceFilter.class);

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    logger.info("init : ");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    logger.info("trace filter");

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;

    String uid = httpServletRequest.getParameter("uid");
    logger.info("" + uid);
    MDC.put("uid", uid);
    logger.info("ServletRequest initialized. Remote IP=" + httpServletRequest.getRemoteAddr());

    chain.doFilter(request, response);

    return;
  }

  @Override
  public void destroy() {
    logger.info("init");
  }
}
