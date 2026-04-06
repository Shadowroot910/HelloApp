package org.example;

public class HelloApp {

    public static void main(String[] args) {

        // Default value
        String names = "World";

        // If arguments are provided, join them
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}