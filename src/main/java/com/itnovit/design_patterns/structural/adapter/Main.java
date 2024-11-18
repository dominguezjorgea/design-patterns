package com.itnovit.design_patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        // ExternalUser instance (Adaptee)
        ExternalUser externalUser = new ExternalUser("John Doe", "john.doe@example.com");

        // Adapting ExternalUser to User using UserAdapter
        User userAdapter = new UserAdapter(externalUser);

        // Using the existing UserService with the adapted ExternalUser
        UserService userService = new UserService();
        userService.printUserDetails(userAdapter);
    }
}

