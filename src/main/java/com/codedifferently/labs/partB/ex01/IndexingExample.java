package com.codedifferently.labs.partB.ex01; // Defines the package location of this class

public class IndexingExample { // Declares the public class named IndexingExample

    public static String index(){ // Declares a public static method named index which returns a String
        String response = ""; // Initializes an empty String variable named response

        String phoneNum = "404-543-2345"; // Initializes a String variable named phoneNum with the value "404-543-2345"
        int idx1 = phoneNum.indexOf('-'); // Finds the index of the first dash in phoneNum and stores it in idx1
        response += "index of first dash: "+ idx1 + "\n"; // Appends the index of the first dash to the response string

        int idx2 = phoneNum.indexOf('-', idx1 + 1); // Finds the index of the second dash in phoneNum, starting the search just after the first dash, and stores it in idx2
        response += "second dash index: "+ idx2; // Appends the index of the second dash to the response string

        return response; // Returns the response string
    }

    public static void main(String args[]) { // Declares the main method which is the entry point of the program
        String indexOutput = index(); // Calls the index method and stores its return value in indexOutput
        System.out.print(indexOutput); // Prints the indexOutput string to the console
    }
}
