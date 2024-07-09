package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction(){
        String response = "";
        String greeting = "Learning Java is a good time!";

        // Extracting substrings
        String substring1 = greeting.substring(0, 5);    
        String substring2 = greeting.substring(7, 11);   
        String substring3 = greeting.substring(7);      
        // Constructing the response
        response = substring1 + "\n" + substring2 + "\n" + substring3;

        return response;
    }

    public static void main(String[] args) {
        String extractionOutput = extraction();
        System.out.println(extractionOutput);
    }
}
