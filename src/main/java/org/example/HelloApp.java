package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String message;

        // No arguments → default
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);

            message = "Hello, " + finalNames + "!";
        }

        // Print result
        System.out.println(message);
    }
}