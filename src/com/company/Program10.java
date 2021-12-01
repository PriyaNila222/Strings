package com.company;

//Replacing characters in strings with replace()

public class Program10 {
    public static void main(String[] args) {
        String inputString = "I love my country";
        String replacedString = inputString.replace("country", "India");

        System.out.println("Input string is: " + inputString);
        System.out.println("Replaced string is: " + replacedString);
    }
}
