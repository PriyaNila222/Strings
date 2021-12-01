package com.company;

//Program to find the length of the string

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String userInput = scanner.nextLine();
        System.out.println("Length of the string is: " + userInput.length());
    }
}
