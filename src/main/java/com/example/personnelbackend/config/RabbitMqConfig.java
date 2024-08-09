package com.example.personnelbackend.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue personnelQueue() {
        return new Queue("personnelQueue", false);
    }
}
