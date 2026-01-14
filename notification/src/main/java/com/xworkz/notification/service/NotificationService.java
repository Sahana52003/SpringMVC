package com.xworkz.notification.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService implements Notification{
    @Override
    public void send() {
        System.out.println("Send and receive a notification");
    }
}
