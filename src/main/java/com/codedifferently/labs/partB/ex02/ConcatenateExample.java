package com.codedifferently.labs.partB.ex02; // Declares the package name for the class

public class ConcatenateExample { // Declares a public class named ConcatenateExample

    public static String concat() { // Declares a public static method named concat that returns a String
        String response = ""; // Initializes an empty String variable named response
        String myString = "Hello"; // Initializes a String variable named myString with the value "Hello"

        myString = myString + "!"; // Concatenates "!" to myString, making it "Hello!"
        response += myString; // Appends myString to response, so response now contains "Hello!"

        return response; // Returns the response string
    }

    public static void main(String[] args) { // The main method, which is the entry point of the program
        String concat = concat(); // Calls the concat method and stores the returned value in a String variable named concat
        System.out.print(concat); // Prints the value of concat to the console
    }
}
