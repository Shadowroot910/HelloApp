package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String name;

        // Check if multiple names are provided
        if (args.length > 0) {
            name = String.join(", ", args);  // Join all names with comma
        } else {
            name = "World";  // Default value
        }

        // Display greeting
        System.out.println("Hello, " + name + "!");
    }
}