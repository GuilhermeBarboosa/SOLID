package com.rocha.solid.ISP.controller;

import com.rocha.solid.ISP.input.CreditCardRequest;
import com.rocha.solid.ISP.input.PixRequest;
import com.rocha.solid.ISP.processor.CreditCardPaymentProcessor;
import com.rocha.solid.ISP.processor.PixPaymentProcessor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/payment-isp")
public class PaymentISPController {

    private final PixPaymentProcessor pixPaymentProcessor;
    private final CreditCardPaymentProcessor creditCardPaymentProcessor;

    public PaymentISPController(PixPaymentProcessor pixPaymentProcessor,
                                CreditCardPaymentProcessor creditCardPaymentProcessor) {
        this.pixPaymentProcessor = pixPaymentProcessor;
        this.creditCardPaymentProcessor = creditCardPaymentProcessor;
    }

    @PostMapping("/process-pix")
    public void processPayment(@RequestBody PixRequest pixRequest) {
        this.pixPaymentProcessor.process(pixRequest);
    }

    @PostMapping("/process-credit-card")
    public void processPayment(@RequestBody CreditCardRequest creditCardRequest) {
        this.creditCardPaymentProcessor.process(creditCardRequest);
    }

}
