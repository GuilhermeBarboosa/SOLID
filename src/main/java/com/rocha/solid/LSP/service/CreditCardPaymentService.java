package com.rocha.solid.LSP.service;

import com.rocha.solid.LSP.ENUM.PaymentType;
import com.rocha.solid.LSP.input.CreditCardRequest;
import com.rocha.solid.LSP.input.PaymentRequest;
import com.rocha.solid.LSP.input.PixRequest;
import com.rocha.solid.LSP.interfaces.CardPayment;
import com.rocha.solid.LSP.interfaces.PaymentInterface;
import com.rocha.solid.LSP.processor.PaymentProcessor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class CreditCardPaymentService implements PaymentProcessor<CreditCardRequest> {


    public boolean validateCardNumber(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 4) {
            return false;
        } else {
            return true;
        }
    }

    public BigDecimal calculateInterest(BigDecimal amount, int months) {
        // Implement interest calculation logic here
        return amount.multiply(new BigDecimal("0.05")).multiply(new BigDecimal(months));
    }

    @Override
    public void process(CreditCardRequest request) {
        if(validateCardNumber(request.getCardNumber())) {
            System.out.println("Card number is valid.");
            System.out.println("Calculating interest for amount: " + request.getAmount() + " over " + request.getMonth() + " months.");
            BigDecimal interest = calculateInterest(request.getAmount(), request.getMonth());
            System.out.println("Interest calculated: " + interest);
            System.out.println("Total amount to be paid: " + request.getAmount().add(interest));
        } else {
            throw new IllegalArgumentException("Invalid card number");
        }
        System.out.println("Processing credit card payment...");
    }

}
