package com.company;

//Trimming strings with trim()

public class Program9 {
    public static void main(String[] args) {
        String originalString = " " + "My name is Priya" + " ";
        String duplicateString = originalString;
        int originalStringLength = originalString.length();
        System.out.println("Original string=" + originalString);
        System.out.println("Original string length = " + originalStringLength);

        String trimmedString = originalString.trim();
        int trimmedStringLength = trimmedString.length();
        System.out.println("Trimmed string=" + trimmedString);
        System.out.println("Trimmed string length = " + trimmedStringLength);
    }
}