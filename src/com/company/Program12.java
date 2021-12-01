package com.company;

//Converting numbers to string using valueOf()

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the byte value: ");
        byte byteValue = scanner.nextByte();
        System.out.println("Enter the short value: ");
        short shortValue = scanner.nextShort();
        System.out.println("Enter the integer value: ");
        int integerValue = scanner.nextInt();
        System.out.println("Enter the float value: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Enter the double value: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Enter the long value: ");
        long longValue = scanner.nextLong();

        System.out.println("Output String is : " + String.valueOf(byteValue)+ String.valueOf(shortValue)+String.valueOf(integerValue)+String.valueOf(floatValue)+String.valueOf(doubleValue)+String.valueOf(longValue));
    }
}
