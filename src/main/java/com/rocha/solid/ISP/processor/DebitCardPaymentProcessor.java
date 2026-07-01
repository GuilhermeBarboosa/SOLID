package com.rocha.solid.ISP.processor;

import com.rocha.solid.ISP.input.CreditCardRequest;
import com.rocha.solid.ISP.interfaces.CardPayment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DebitCardPaymentProcessor implements PaymentProcessor<CreditCardRequest>, CardPayment {

    @Override
    public boolean validateCardNumber(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 4) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean validateExpirationDate(String expirationDate) {
        System.out.println("Validating expiration date: " + expirationDate);
        return true;
    }

    @Override
    public boolean validateCVV(String cvv) {
        System.out.println("Validating CVV: " + cvv);
        return true;
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
