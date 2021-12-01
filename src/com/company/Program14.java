package com.company;

//Converting to uppercase and lowercase

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String inputString = scanner.nextLine();

        System.out.println("Print " + "\"" + inputString + "\"" + " in uppercase: " + inputString.toUpperCase());
        System.out.println("Print " + "\"" + inputString + "\"" + " in lowercase: " + inputString.toLowerCase());
    }
}
