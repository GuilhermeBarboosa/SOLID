package com.rocha.solid.clean_code.processor;

public class EmailProcessor implements NotificationProcessor<String> {
    @Override
    public void sendNotification(String notification) {
        System.out.println("Sending email notification: " + notification);
    }
}
