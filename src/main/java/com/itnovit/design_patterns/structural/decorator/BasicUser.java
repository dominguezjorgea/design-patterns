package com.itnovit.design_patterns.structural.decorator;

public class BasicUser implements User {
    private String name;
    private String email;

    public BasicUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getDetails() {
        return "Name: " + name + ", Email: " + email;
    }
}

