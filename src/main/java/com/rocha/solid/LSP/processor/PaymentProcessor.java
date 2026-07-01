package com.rocha.solid.LSP.processor;

import com.rocha.solid.LSP.input.PaymentRequest;

public interface PaymentProcessor<T extends PaymentRequest> {

    void process(T request);

}