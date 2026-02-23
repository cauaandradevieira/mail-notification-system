package com.example.demo.rabbit.listener;

import com.example.demo.dto.email.request.EmailRequest;
import com.example.demo.services.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailListener
{
    private final EmailService emailService;

    @RabbitListener(queues = "email.queue")
    public void send(EmailRequest request)
    {
        System.out.println("enviando email para o " + request.to());
        emailService.send(request);
    }
}
