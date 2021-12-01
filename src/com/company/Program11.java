package com.company;

//Splitting string with split()

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        System.out.println("Splitted words are:");
        String[] splittedWords = sentence.split(" ");
        for (String words : splittedWords) {
            System.out.println(words);
        }
    }
}
