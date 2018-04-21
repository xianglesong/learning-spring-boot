package com.xianglesong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.xianglesong.mapper")
public class StartApp {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(StartApp.class).run(args);
    context.addApplicationListener(new ApplicationPidFileWriter());
  }

}
