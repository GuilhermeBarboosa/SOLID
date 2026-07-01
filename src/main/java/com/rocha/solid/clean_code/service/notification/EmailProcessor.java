package com.rocha.solid.clean_code.service.notification;

import com.rocha.solid.clean_code.input.EmailInput;
import com.rocha.solid.clean_code.processor.NotificationProcessor;
import org.springframework.stereotype.Service;

@Service
public class EmailProcessor implements NotificationProcessor<EmailInput> {

    @Override
    public void sendNotification(EmailInput notification) {
        System.out.println("Sending email to: " + notification.getEmail());
    }
}
