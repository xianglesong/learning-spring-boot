package com.xianglesong.kafka.consumer;

import com.google.gson.Gson;

import com.xianglesong.kafka.entity.Message;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by rollin on 18/3/23.
 */

@Component
// @Slf4j
public class KafkaReceiver {

  @KafkaListener(id = "id1", topics = "tester")
  public void listen4ack(@Payload String message, Acknowledgment ack) {
    Gson gson = new Gson();
    Message msg = gson.fromJson(message.toString(), Message.class);
    System.out.println("------------------ message =" + message);
    System.out.println("msg payload: " + msg.getMsg());
    ack.acknowledge();
  }
}
