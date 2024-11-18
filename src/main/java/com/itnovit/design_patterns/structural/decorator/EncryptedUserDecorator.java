package com.itnovit.design_patterns.structural.decorator;

import java.util.Base64;

public class EncryptedUserDecorator extends UserDecorator {
    public EncryptedUserDecorator(User decoratedUser) {
        super(decoratedUser);
    }

    @Override
    public String getDetails() {
        String details = super.getDetails();
        return "Encrypted: " + Base64.getEncoder().encodeToString(details.getBytes());
    }
}

