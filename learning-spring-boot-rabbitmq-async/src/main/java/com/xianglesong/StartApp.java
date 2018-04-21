package com.xianglesong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class})
public class StartApp {
  public static final Logger logger = LoggerFactory.getLogger(StartApp.class);

  public static void main(String[] args) {
    logger.info("start");
    logger.error("error");
    ConfigurableApplicationContext context = new SpringApplicationBuilder(StartApp.class).run(args);
    context.addApplicationListener(new ApplicationPidFileWriter());
  }

}
