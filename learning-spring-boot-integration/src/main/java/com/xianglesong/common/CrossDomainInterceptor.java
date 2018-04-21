package com.xianglesong.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CrossDomainInterceptor extends HandlerInterceptorAdapter {
  // 继承HandlerInterceptorAdapter类
  private static final Logger logger = LoggerFactory.getLogger(CrossDomainInterceptor.class);

  /**
   * preHandle方法是进行处理器拦截用的，顾名思义，该方法将在Controller处理之前进行调用
   */
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
    response.addHeader("Access-Control-Allow-Headers", "Content-Type,"
        + "X-Requested-With,Accept,Origin,token");
    response.addHeader("Access-Control-Max-Age", "1800");
    if (request.getMethod().equals("OPTIONS")) {
      return false;
    }
    return true;
  }

  /**
   * 这个方法只会在当前这个Interceptor的preHandle方法返回值为true的时候才会执行。
   */
  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o,
      ModelAndView mav) throws Exception {}

  /**
   * 该方法也是需要当前对应的Interceptor的preHandle方法的返回值为true时才会执行。该方法将在整个请求完成之后执行
   */
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o,
      Exception excptn) throws Exception {}
}
