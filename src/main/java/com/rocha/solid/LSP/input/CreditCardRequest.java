package com.rocha.solid.LSP.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCardRequest extends PaymentRequest {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;
}
