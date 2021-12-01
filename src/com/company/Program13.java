package com.company;

//Converting integer object to string

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer value: ");
        int integerValue = scanner.nextInt();

        String stringObject = Integer.toString(integerValue);
        System.out.println("Adding 100 to integer value: " + (integerValue + 100));
        System.out.println("Adding 100 to converted integer object to string: " + (stringObject+100));
    }
}
