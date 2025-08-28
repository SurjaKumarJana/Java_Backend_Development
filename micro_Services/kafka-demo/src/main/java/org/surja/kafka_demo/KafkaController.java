package org.surja.kafka_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/kafka-demo")
public class KafkaController {

    private static Logger LOGGER = LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    private JavaMailSender javaMailSender;


    @GetMapping("/push")
    ResponseEntity<String> pushDataToKafka(@RequestParam String topic, @RequestParam String data) throws ExecutionException, InterruptedException {
        Future future = kafkaTemplate.send(topic,data,data);
        LOGGER.info("Payload pushed to kafka : {}",future.get());
        return ResponseEntity.ok("Data pushed");
    }

    @PostMapping("/email")
    ResponseEntity<String> sendEmail(@RequestBody EmailDTO emailDTO){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("email@gmail.com");
        simpleMailMessage.setSubject(emailDTO.getSubject());
        simpleMailMessage.setTo(emailDTO.getToEmail());
        simpleMailMessage.setText(emailDTO.getBody());
        simpleMailMessage.setCc(emailDTO.getCc());
        javaMailSender.send(simpleMailMessage);
        return ResponseEntity.ok("Email Sent");

    }

    @PostMapping("/fast-email")
    ResponseEntity<String> fastEmail(@RequestBody EmailDTO emailRequest) throws ExecutionException, InterruptedException {
        Future future = kafkaTemplate.send("EmailToSend",emailRequest.getToEmail(),emailRequest);
        LOGGER.info("Payload pushed to kafka : {}",future.get());
        return ResponseEntity.ok("Pushed to kafka");

    }



}
