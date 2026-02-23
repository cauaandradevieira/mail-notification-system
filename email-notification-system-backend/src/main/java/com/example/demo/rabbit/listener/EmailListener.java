package com.example.demo.rabbit.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
class EmailListener
{

    @RabbitListener(queues = "email.queue")
    public void send()
    {
        System.out.println("enviando email...");
    }
}
