package com.rocha.solid.LSP.service;

import com.rocha.solid.LSP.ENUM.PaymentType;
import com.rocha.solid.LSP.input.PaymentRequest;
import com.rocha.solid.LSP.interfaces.PaymentInterface;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BankSlipPaymentService implements PaymentInterface {

    @Override
    public void processPayment(PaymentRequest paymentRequest) {
        System.out.println("Processing bank slip payment...");
        this.generateBankSlip("Carlos", paymentRequest.getAmount());
    }

    @Override
    public PaymentType getType() {
        return PaymentType.BANK_SLIP;
    }

    public void generateBankSlip(String customerName, BigDecimal amount) {
        System.out.println("Generating bank slip for " + customerName + " with amount: " + amount);
    }
}
