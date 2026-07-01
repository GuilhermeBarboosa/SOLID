package com.rocha.solid.LSP.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PixRequest extends PaymentRequest {
    private String pixKey;
}
