package com.rocha.solid.DIP.controller;

import com.rocha.solid.DIP.input.EmailInput;
import com.rocha.solid.DIP.input.GoogleInput;
import com.rocha.solid.DIP.processor.EmailProcessor;
import com.rocha.solid.DIP.processor.GoogleProcessor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/login")
public class LoginController {

   private final EmailProcessor emailProcessor;
    private final GoogleProcessor googleProcessor;

   LoginController(EmailProcessor emailProcessor,
                   GoogleProcessor googleProcessor) {
        this.emailProcessor = emailProcessor;
        this.googleProcessor = googleProcessor;
    }

    @PostMapping("/email")
    public void login(@RequestBody EmailInput emailInput) {
        this.emailProcessor.login(emailInput);
    }

    @PostMapping("/google")
    public void login(@RequestBody GoogleInput googleInput) {
        this.googleProcessor.login(googleInput);
    }

}
