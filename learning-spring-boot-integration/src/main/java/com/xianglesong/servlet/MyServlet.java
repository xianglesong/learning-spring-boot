package com.xianglesong.servlet;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/myservlet", description = "servelt 描述")
public class MyServlet extends HttpServlet {

  private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MyServlet.class);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    logger.info("do get");
    resp.getWriter().write("MyServlet access success");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
      IOException {
    this.doGet(req, resp);
  }

}
