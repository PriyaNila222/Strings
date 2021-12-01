package com.company;

//Program using equalIgnoreCase(), startsWith(), endsWith() anf compareTo()

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        String firstString = "Priya";
        String secondString = "PRIYA";
        String thirdString = "Nila";

        System.out.println("\"" + firstString + "\"" +" is equal to " + "\"" + secondString + "\"" + ": " + firstString.equalsIgnoreCase(secondString));
        System.out.println("\"" + firstString + "\"" +" is equal to " + "\"" + thirdString + "\"" + ": " + firstString.equalsIgnoreCase(thirdString));

        System.out.println("Check \"Priya\" starts with \"pr\": " + firstString.startsWith("pr"));
        System.out.println("Check \"Priya\" starts with \"Pr\": " + firstString.startsWith("Pr"));

        System.out.println("Check \"Nila\" ends with \"a\": " + thirdString.endsWith("a"));

        System.out.println("Checking \"Priya\" and \"priya\" using compareTo(): " + firstString.compareTo(secondString));
        System.out.println("Checking \"Priya\" and \"Nila\" using compareTo(): " + firstString.compareTo(thirdString));
        System.out.println("Checking \"Priya\" and \"priya\" using compareTo(): " + firstString.compareTo(firstString));
    }
}
