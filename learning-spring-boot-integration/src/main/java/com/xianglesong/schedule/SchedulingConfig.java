package com.xianglesong.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulingConfig {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  // 每5s执行一次
  @Scheduled(cron = "0/5 * * * * ?")
  public void checkDBStatus() {
    logger.info("timer trigger");
  }
}
