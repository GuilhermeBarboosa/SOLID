package com.rocha.solid.ISP.interfaces;

import com.rocha.solid.ISP.ENUM.PaymentType;
import com.rocha.solid.ISP.input.PaymentRequest;

public interface PaymentInterface {
    public void processPayment(PaymentRequest paymentRequest);
    public PaymentType getType();
}
