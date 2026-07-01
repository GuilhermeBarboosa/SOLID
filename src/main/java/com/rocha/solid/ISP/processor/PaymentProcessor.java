package com.rocha.solid.ISP.processor;

import com.rocha.solid.ISP.input.PaymentRequest;

public interface PaymentProcessor<T extends PaymentRequest> {

    void process(T request);

}