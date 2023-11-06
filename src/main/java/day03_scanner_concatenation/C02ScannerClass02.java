package day03_scanner_concatenation;

import java.util.Scanner;

public class C02ScannerClass02 {

    public static void main(String[] args) {

        //Example 2: Ask user to enter the width and the length of a rectangle
        // then print the area and the perimeter on the console

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle...");

        double width = input.nextDouble();

        System.out.println("Enter the length of the rectangle...");

        double length = input.nextDouble();

        System.out.println("Area of the rectangle is " + width + " x " + length + " = " + (width*length));

        System.out.println("Perimeter of the rectangle is " + width+" + "+width + " + " + length+" + "+length + " = " + (2*(width+length)));

    }

}
