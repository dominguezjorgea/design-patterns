package com.itnovit.design_patterns.structural.adapter;

public class ExternalUser {
    private String name;
    private String contactInfo;

    public ExternalUser(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}

