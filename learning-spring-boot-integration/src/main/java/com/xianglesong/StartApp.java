package com.xianglesong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.xianglesong.servlet.MyListener;
import com.xianglesong.servlet.MyServlet;
import com.xianglesong.servlet.TraceFilter;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class})
public class StartApp {
  public static final Logger logger = LoggerFactory.getLogger(StartApp.class);

  @Bean
  public ServletRegistrationBean servletRegistrationBean() {
    return new ServletRegistrationBean(new MyServlet(), "/servlet/*");
  }

  @Bean
  public FilterRegistrationBean traceFilterRegistration() {
    FilterRegistrationBean traceFilter = new FilterRegistrationBean();
    traceFilter.setFilter(new TraceFilter());
    return traceFilter;
  }

  @Bean
  public ServletListenerRegistrationBean<MyListener> myServletListener() {
    ServletListenerRegistrationBean<MyListener> myListener =
        new ServletListenerRegistrationBean<MyListener>();
    myListener.setListener(new MyListener());
    return myListener;
  }

  public static void main(String[] args) {
    logger.info("start");
    logger.error("error");
    ConfigurableApplicationContext context = new SpringApplicationBuilder(StartApp.class).run(args);
    context.addApplicationListener(new ApplicationPidFileWriter());
  }

}
