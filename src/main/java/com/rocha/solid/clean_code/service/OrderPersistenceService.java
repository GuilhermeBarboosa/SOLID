package com.rocha.solid.clean_code.service;

import com.rocha.solid.clean_code.entity.Order;
import com.rocha.solid.clean_code.input.EmailInput;
import com.rocha.solid.clean_code.processor.NotificationProcessor;
import com.rocha.solid.clean_code.service.notification.EmailProcessor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderPersistenceService {

    private final EmailProcessor notification;

    public OrderPersistenceService(EmailProcessor notification) {
        this.notification = notification;
    }

    public void persistOrder(Order order, BigDecimal totalPrice, BigDecimal totalShipping) {
        System.out.println("Saving order...");
        this.orderRepository.save(order);
        System.out.println("Generating invoice...");
        this.invoiceService.generateInvoice(order);
        System.out.println("Sending email...");
        this.notification.sendNotification(new EmailInput());
        System.out.println("Generating log...");
        this.log.generateLogOrder(order);
        System.out.println("Order total: " + totalPrice);
    }

}
