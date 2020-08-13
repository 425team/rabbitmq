package com.unti.rabbitmq.service.impl;

import com.unti.rabbitmq.po.Mail;
import com.unti.rabbitmq.service.Producer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Transactional
@Service("producer")
public class ProducerImpl implements Producer {
    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendMail(String queue, Mail mail) {
        rabbitTemplate.setQueue(queue);
        rabbitTemplate.convertAndSend(queue, mail);
        System.out.println(new Date().toString());
    }

    public void sendReceiveMail(String queue, Mail mail) {
        rabbitTemplate.setQueue(queue);
        rabbitTemplate.convertSendAndReceive(queue, mail);
        System.out.println(new Date().toString());
    }

}
