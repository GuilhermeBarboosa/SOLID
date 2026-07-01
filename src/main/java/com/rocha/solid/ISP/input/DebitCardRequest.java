package com.rocha.solid.ISP.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DebitCardRequest extends PaymentRequest {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;
}
