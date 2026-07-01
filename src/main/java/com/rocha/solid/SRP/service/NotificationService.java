package com.rocha.solid.SRP.service;

import com.rocha.solid.SRP.entity.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void send(Notification notification) {
        System.out.println("Sending notification: " + notification.getMessage());
    }
}
