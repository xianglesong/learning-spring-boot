package com.xianglesong;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StartApp {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(StartApp.class).run(args);
    context.addApplicationListener(new ApplicationPidFileWriter());
  }

}
