package br.mil.fab.ccarj.kafka.producer.controller;


import br.mil.fab.ccarj.kafka.producer.model.EnrollmentMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class MessageController {

    @Autowired
    private KafkaTemplate<String, EnrollmentMessage> kafkaTemplate;

    private static final String TOPIC = "Auth_message";

    @PostMapping("/send")
    public String post(@RequestBody EnrollmentMessage message) {
        kafkaTemplate.send(TOPIC, message);
        return "Published successfully";
    }
}