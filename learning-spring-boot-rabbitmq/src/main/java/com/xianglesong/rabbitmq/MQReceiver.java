package com.xianglesong.rabbitmq;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MQReceiver {
  private static final Logger logger = LoggerFactory.getLogger(MQReceiver.class);

  @RabbitListener(queues = "${search.sync.index.rabbitmq}")
  public void receive(Message message) {
    logger.info("receive: ");
    try {
      if (message != null && message.getBody() != null) {
        String jsonString = new String(message.getBody(), "UTF-8");
        logger.info("rec : " + jsonString);
      }
    } catch (Exception ex) {
      logger.error("mq process excepion", ex);
      throw new RuntimeException("mq process excepion");
    }
  }
}
