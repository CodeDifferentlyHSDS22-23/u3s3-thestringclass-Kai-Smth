package com.codedifferently.labs.partA.ex02;

import java.util.Scanner;

public class NameMaker {
    public static String nameMaker(String firstName, String middleName, String lastName) {
        String response = "";
        String fullName;
        fullName=firstName+" "+middleName+" "+lastName;
        response += ("Your full name is "+ fullName);
        return response;
    }

    public static void main(String[] args) {
        String firstName, middleName, lastName;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first name:");

        firstName = in.next();
        System.out.println("Enter your middle name:");

        middleName = in.next();
        System.out.println("Enter your last name:");

        lastName = in.next();
        String fullName  = nameMaker(firstName, middleName, lastName);
        System.out.println(fullName);
    }
}
