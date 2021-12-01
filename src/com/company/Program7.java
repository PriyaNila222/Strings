package com.company;

//Comparing two strings using equal()

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        if(firstString.equals(secondString)) {
            System.out.println("Both the strings are equal");
        } else {
            System.out.println("Both the string are not equal");
        }
    }
}
