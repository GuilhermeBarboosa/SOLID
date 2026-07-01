package com.rocha.solid.clean_code.processor;

public interface NotificationProcessor<T> {
    public void sendNotification(T notification);
}
