package com.rocha.solid.DIP.processor;

public interface LoginProcessor<T> {
    void login(T request);
}
