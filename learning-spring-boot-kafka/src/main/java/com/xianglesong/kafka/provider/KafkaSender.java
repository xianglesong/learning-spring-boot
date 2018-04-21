package com.xianglesong.kafka.provider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.xianglesong.kafka.entity.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

import lombok.extern.slf4j.Slf4j;

@Component
// @Slf4j
public class KafkaSender {

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  private Gson gson = new GsonBuilder().create();

  // 发送消息方法
  public void send() {
    Message message = new Message();
    message.setId(System.currentTimeMillis());
    message.setMsg(UUID.randomUUID().toString() + ":消息测试");
    message.setSendTime(new Date());
    System.out.println("+++++++++++++++++++++  message = " + gson.toJson(message));
    kafkaTemplate.send("tester1", gson.toJson(message));
  }
}
