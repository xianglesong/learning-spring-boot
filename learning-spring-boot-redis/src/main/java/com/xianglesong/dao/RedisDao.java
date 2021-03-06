package com.xianglesong.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Calendar;

import javax.annotation.Resource;

@Component
public class RedisDao {

  public static Logger logger = LoggerFactory.getLogger(RedisDao.class);

  @Autowired
  @Qualifier("searchStringRedisTemplate")
  private StringRedisTemplate stringRedisTemplate;

  @Resource(name = "searchStringRedisTemplate")
  private ValueOperations<String, String> valueOperationsStr;

  public String getValue(String key) {
    System.out.println(valueOperationsStr.get(key));
    System.out.println("execute: " + Calendar.getInstance());

    // byte[] xx = stringRedisTemplate.getConnectionFactory().getConnection().get(key.getBytes());
    // String yy = new String(xx);
    
    return valueOperationsStr.get(key);
  }
}
