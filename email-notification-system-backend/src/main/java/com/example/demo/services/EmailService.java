package com.example.demo.services;

import com.example.demo.dto.email.request.EmailRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender javaMailSender;

    public void send(EmailRequest request)
    {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(request.to());
        simpleMailMessage.setSubject(request.subject());
        simpleMailMessage.setText(request.body());

        javaMailSender.send(simpleMailMessage);
    }
}
