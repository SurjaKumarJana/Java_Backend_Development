package org.surja.email_service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.common.utils.Java;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {

    @Autowired
    private JavaMailSender javaMailSender;

    private static Logger LOGGER = LoggerFactory.getLogger(KafkaConfig.class);

    private ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "demo", groupId = "app1")
    public void consumeData(Object payload){
        String data = (String) ((ConsumerRecord) payload).value();
        LOGGER.info("Data Consuming payload: {}",payload);
        LOGGER.info("Data Consuming Value: {}",data);
    }

    @KafkaListener(topics = "EmailToSend", groupId = "email")
    public void emailToSend(Object payload) throws JsonProcessingException {
        String jsonValue = (String) ((ConsumerRecord)payload).value();
        EmailDTO emailRequest = objectMapper.readValue(jsonValue,EmailDTO.class);
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("email@gmail.com");
        simpleMailMessage.setSubject(emailRequest.getSubject());
        simpleMailMessage.setTo(emailRequest.getToEmail());
        simpleMailMessage.setText(emailRequest.getBody());
        simpleMailMessage.setCc(emailRequest.getCc());
        javaMailSender.send(simpleMailMessage);
        LOGGER.info("Email sent to: {}",emailRequest.getToEmail());
    }


}