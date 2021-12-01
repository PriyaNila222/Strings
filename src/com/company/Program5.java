package com.company;

//Searching in string using Indexof()

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String userInput = scanner.nextLine();
        System.out.print("Enter the sub string: ");
        String subString = scanner.nextLine();

        int index = userInput.indexOf(subString);
        System.out.println(subString + " " + "is in the index: " + index);
    }
}
