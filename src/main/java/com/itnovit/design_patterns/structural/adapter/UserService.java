package com.itnovit.design_patterns.structural.adapter;

public class UserService {
    public void printUserDetails(User user) {
        System.out.println("Full Name: " + user.getFullName());
        System.out.println("Email: " + user.getEmail());
    }
}

