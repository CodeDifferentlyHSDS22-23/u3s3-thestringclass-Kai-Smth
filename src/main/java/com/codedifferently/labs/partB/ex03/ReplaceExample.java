package com.codedifferently.labs.partB.ex03;

public class ReplaceExample {

    // Method to perform string replacement
    public static String replace() {
        // Initialize an empty string to store the response
        String response = "";

        // Original string to be manipulated
        String replace = "String replace with replace First";

        // Replace the first occurrence of "re" with "RE" in the string
        String newString = replace.replaceFirst("re", "RE");

        // Append the manipulated string to the response
        response += newString;

        // Return the modified string
        return response;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Invoke the replace method and store the result
        String replacedOutput = replace();

        // Print the modified string
        System.out.println(replacedOutput);
    }
}
