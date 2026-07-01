package com.rocha.solid.LSP.input;

import com.rocha.solid.LSP.ENUM.PaymentType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PaymentRequest {
    private BigDecimal amount;
    private Integer month;
    private PaymentType paymentType;

    private String pixKey;

}
