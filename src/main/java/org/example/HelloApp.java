package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String message;

        // Check if no arguments are provided
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            message = "Hello, " + nameBuilder.toString() + "!";
        }

        // Print final message
        System.out.println(message);
    }
}