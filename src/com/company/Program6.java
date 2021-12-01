package com.company;

//Matching a string aganist a regular expression with matches()

public class Program6 {
    public static void main(String[] args) {
        String message = "Hi how are you??";
        System.out.println("Given string is: " + message);
        System.out.println("Finding the matches \"how\" by (\"how\"): " + message.matches("how"));
        System.out.println("Finding the matches \"how\" by (\"(.*) how (.*)\") : " + message.matches("(.*) how (.*)"));
    }
}
