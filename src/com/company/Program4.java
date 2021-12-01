package com.company;

//Exact a string using substring

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String userInput = scanner.nextLine();
        System.out.print("Enter the begin index: ");
        int beginIndex = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        String subString = userInput.substring(beginIndex, endIndex);
        System.out.println("Exacted sub string is: " + subString);
    }

}
