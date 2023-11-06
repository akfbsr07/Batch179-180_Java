package day03_scanner_concatenation;

import java.util.Scanner;

public class C01ScannerClass01 {

    public static void main(String[] args) {

        //Example 1: Ask user to enter 2 numbers, then print the sum and multiplication of the numbers on the console

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number please...");

        double num1 = input.nextDouble();

        System.out.println("Enter a second number please...");

        double num2 = input.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));

    }

}
