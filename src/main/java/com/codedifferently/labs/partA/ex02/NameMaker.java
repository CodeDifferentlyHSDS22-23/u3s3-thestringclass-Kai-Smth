package com.codedifferently.labs.partA.ex02;

import java.util.Scanner;

public class NameMaker {
    public static String nameMaker(String firstName, String middleName, String lastName) {
        String response = "";
        String fullName;
        fullName = firstName + " " + middleName + " " + lastName;
        response += ("Your full name is " + fullName);
        return response;
    }

    public static void main(String[] args) {
        String firstName = "";
        String middleName = "";
        String lastName = "";
        /* Put your code in between these comments : Top */

        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter first name
        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();

        // Prompt user to enter middle name
        System.out.print("Enter your middle name: ");
        middleName = scanner.nextLine();

        // Prompt user to enter last name
        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        /* Put your code in between these comments : Bottom */
        String fullName = nameMaker(firstName, middleName, lastName);
        System.out.println(fullName);
    }
}
