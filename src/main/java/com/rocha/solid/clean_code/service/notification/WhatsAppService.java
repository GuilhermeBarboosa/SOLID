package com.rocha.solid.clean_code.service.notification;

import com.rocha.solid.clean_code.input.WhatsaAppInput;
import com.rocha.solid.clean_code.processor.NotificationProcessor;
import org.springframework.stereotype.Service;

@Service
public class WhatsAppService implements NotificationProcessor<WhatsaAppInput> {

    @Override
    public void sendNotification(WhatsaAppInput notification) {
        System.out.println("Sending WhatsApp message: " + notification);
    }
}
