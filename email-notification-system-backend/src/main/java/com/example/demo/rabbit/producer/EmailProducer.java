package com.example.demo.rabbit.producer;

import com.example.demo.dto.email.request.EmailRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailProducer {

    private final RabbitTemplate rabbitTemplate;

    public void sendToQueue(EmailRequest request)
    {
        rabbitTemplate.convertAndSend("email.exchange", "email.routing", request);
    }
}
