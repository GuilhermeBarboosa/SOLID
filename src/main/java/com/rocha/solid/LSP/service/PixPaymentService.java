package com.rocha.solid.LSP.service;

import com.rocha.solid.LSP.ENUM.PaymentType;
import com.rocha.solid.LSP.input.PaymentRequest;
import com.rocha.solid.LSP.input.PixRequest;
import com.rocha.solid.LSP.interfaces.PaymentInterface;
import com.rocha.solid.LSP.processor.PaymentProcessor;
import org.springframework.stereotype.Service;

@Service
public class PixPaymentService implements PaymentProcessor<PixRequest> {
    public void generateQrCode(String pixKey) {
        System.out.println("Generating QR code for Pix key: " + pixKey);
    }

    @Override
    public void process(PixRequest request) {
        System.out.println("Processing Pix payment...");
    }
}
