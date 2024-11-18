package com.itnovit.design_patterns.structural.decorator;

public abstract class UserDecorator implements User {
    protected User decoratedUser;

    public UserDecorator(User decoratedUser) {
        this.decoratedUser = decoratedUser;
    }

    @Override
    public String getDetails() {
        return decoratedUser.getDetails();
    }
}

