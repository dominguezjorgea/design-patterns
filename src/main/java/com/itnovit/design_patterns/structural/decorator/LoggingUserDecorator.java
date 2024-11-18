package com.itnovit.design_patterns.structural.decorator;

public class LoggingUserDecorator extends UserDecorator {
    public LoggingUserDecorator(User decoratedUser) {
        super(decoratedUser);
    }

    @Override
    public String getDetails() {
        String details = super.getDetails();
        System.out.println("Logging user details: " + details);
        return details;
    }
}

