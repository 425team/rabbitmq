package com.unti.rabbitmq.service;

import com.unti.rabbitmq.po.Mail;

public interface Producer {
    public void sendMail(String queue, Mail mail);//向队列queue发送消息
}
