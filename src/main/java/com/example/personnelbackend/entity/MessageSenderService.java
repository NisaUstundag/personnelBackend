package com.example.personnelbackend.entity;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSenderService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendPersonnelMessage(String message) {
        rabbitTemplate.convertAndSend("personnelQueue", message);
    }
}