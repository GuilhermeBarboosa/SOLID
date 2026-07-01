package com.rocha.solid.DIP.processor;

import com.rocha.solid.DIP.input.EmailInput;
import org.springframework.stereotype.Service;

@Service
public class EmailProcessor implements LoginProcessor<EmailInput> {

    @Override
    public void login(EmailInput loginInput) {
        System.out.println("Logging in with email: " + loginInput.getEmail());
    }

}
