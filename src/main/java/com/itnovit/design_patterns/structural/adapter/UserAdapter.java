package com.itnovit.design_patterns.structural.adapter;

public class UserAdapter implements User {
    private ExternalUser externalUser;

    public UserAdapter(ExternalUser externalUser) {
        this.externalUser = externalUser;
    }

    @Override
    public String getFullName() {
        return externalUser.getName();
    }

    @Override
    public String getEmail() {
        return externalUser.getContactInfo();
    }
}

