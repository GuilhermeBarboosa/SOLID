package com.rocha.solid.LSP.controller;

import com.rocha.solid.LSP.input.CreditCardRequest;
import com.rocha.solid.LSP.input.PixRequest;
import com.rocha.solid.LSP.service.CreditCardPaymentService;
import com.rocha.solid.LSP.service.PixPaymentService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/payment")
public class PaymentController {

    private final PixPaymentService pixPaymentService;
    private final CreditCardPaymentService creditCardPaymentService;

    public PaymentController(PixPaymentService pixPaymentService,
                             CreditCardPaymentService creditCardPaymentService) {
        this.pixPaymentService = pixPaymentService;
        this.creditCardPaymentService = creditCardPaymentService;
    }

    @PostMapping("/process-pix")
    public void processPayment(@RequestBody PixRequest pixRequest) {
        this.pixPaymentService.process(pixRequest);
    }

    @PostMapping("/process-credit-card")
    public void processPayment(@RequestBody CreditCardRequest creditCardRequest) {
        this.creditCardPaymentService.process(creditCardRequest);
    }

}
