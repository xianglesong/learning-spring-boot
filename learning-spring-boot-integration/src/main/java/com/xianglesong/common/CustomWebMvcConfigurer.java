package com.xianglesong.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CustomWebMvcConfigurer extends WebMvcConfigurerAdapter {

  private static final Logger logger = LoggerFactory.getLogger(CustomWebMvcConfigurer.class);

  @Bean
  public CrossDomainInterceptor getCrossDomainInterceptor() {
    return new CrossDomainInterceptor();
  }

  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(getCrossDomainInterceptor());
  }
}
