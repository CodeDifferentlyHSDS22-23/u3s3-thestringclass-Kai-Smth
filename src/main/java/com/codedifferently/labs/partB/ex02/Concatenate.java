package com.codedifferently.labs.partB.ex02;

public class Concatenate {
    public static String concatenateStrings() {
        // Declare first name and last name variables
        String firstName = "John";
        String lastName = "Doe";

        // Concatenate the two variables
        String fullName = firstName + " " + lastName;

        return fullName;
    }

    public static void main(String[] args) {
        String stringOutput = concatenateStrings();
        System.out.println(stringOutput);
    }
}
