package com.rocha.solid.LSP.interfaces;

import com.rocha.solid.LSP.ENUM.PaymentType;
import com.rocha.solid.LSP.input.PaymentRequest;

public interface PaymentInterface {
    public void processPayment(PaymentRequest paymentRequest);
    public PaymentType getType();
}
