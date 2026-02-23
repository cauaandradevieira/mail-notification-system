package com.example.demo.configuration;

import com.rabbitmq.client.impl.AMQImpl;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfiguration {

    public final String EMAIL_QUEUE = "email.queue";
    public final String EMAIL_EXCHANGE = "email.exchange";
    public final String EMAIL_ROUTING = "email.routing";

    @Bean
    public Queue emailQueue()
    {
        return new Queue(EMAIL_QUEUE, true);
    }

    @Bean
    public DirectExchange exchange()
    {
        return new DirectExchange(EMAIL_EXCHANGE);
    }

    @Bean
    public Binding binding()
    {
        return BindingBuilder.bind(emailQueue())
                .to(exchange())
                .with(EMAIL_ROUTING);
    }
}
