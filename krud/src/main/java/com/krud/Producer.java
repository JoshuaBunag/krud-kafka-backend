package com.krud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    private static final String TOPIC = "user";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String message) {
        logger.info("vvv::  send message");
        kafkaTemplate.send(TOPIC, message);
    }
}
