package com.xianglesong.rabbitmq;

import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;

@Component
public class MQSend {

  private static final Logger logger = LoggerFactory.getLogger(MQSend.class);

  @Autowired
  RabbitTemplate rabbitTemplate;

  @Value("${search.sync.index.rabbitmq}")
  String queues;

  @Async
  public void sendMsg(String msg) {
    logger.info("sendMsg begin: " + msg);
    rabbitTemplate.convertAndSend(queues, msg);
    logger.info("sendMsg end: " + msg);
  }

}
