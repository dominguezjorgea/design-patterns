package com.itnovit.design_patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        // Base User
        User basicUser = new BasicUser("John Doe", "john.doe@example.com");

        // Add logging functionality
        User loggedUser = new LoggingUserDecorator(basicUser);
        System.out.println("Logged User: " + loggedUser.getDetails());

        // Add encryption functionality
        User encryptedUser = new EncryptedUserDecorator(basicUser);
        System.out.println("Encrypted User: " + encryptedUser.getDetails());

        // Combine both logging and encryption
        User loggedAndEncryptedUser = new LoggingUserDecorator(new EncryptedUserDecorator(basicUser));
        System.out.println("Logged and Encrypted User: " + loggedAndEncryptedUser.getDetails());
    }
}

