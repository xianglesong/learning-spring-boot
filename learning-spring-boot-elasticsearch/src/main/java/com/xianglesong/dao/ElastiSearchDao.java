package com.xianglesong.dao;

import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse;
import org.elasticsearch.client.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class ElastiSearchDao {
  public static final Logger logger = LoggerFactory.getLogger(ElastiSearchDao.class);

  @Autowired
  public Client client;

  public boolean indexExist(String indexName) {
    IndicesExistsResponse indicesExistsResponse =
        client.admin().indices().exists(new IndicesExistsRequest(new String[] {indexName}))
            .actionGet();
    boolean result = false;
    if (indicesExistsResponse.isExists()) {
      logger.info("index  " + indexName + "   exist");
      result = true;
    } else {
      logger.info("index  " + indexName + "  not exist");
    }

    System.out.println("execute: " + Calendar.getInstance());

    return result;
  }

}
