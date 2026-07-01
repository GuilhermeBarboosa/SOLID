package com.rocha.solid.ISP.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PixRequest extends PaymentRequest {
    private String pixKey;
}
