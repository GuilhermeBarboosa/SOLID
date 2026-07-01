package com.rocha.solid.ISP.processor;

import com.rocha.solid.ISP.input.PixRequest;
import org.springframework.stereotype.Service;

@Service
public class PixPaymentProcessor implements PaymentProcessor<PixRequest> {
    public void generateQrCode(String pixKey) {
        System.out.println("Generating QR code for Pix key: " + pixKey);
    }

    @Override
    public void process(PixRequest request) {
        System.out.println("Processing Pix payment...");
    }
}
