package com.rocha.solid.DIP.processor;

import com.rocha.solid.DIP.input.EmailInput;
import com.rocha.solid.DIP.input.GoogleInput;
import org.springframework.stereotype.Service;

@Service
public class GoogleProcessor implements LoginProcessor<GoogleInput> {

    @Override
    public void login(GoogleInput googleInput) {
        System.out.println("Logging in with Google account: " + googleInput.getGoogleToken());
    }

}
