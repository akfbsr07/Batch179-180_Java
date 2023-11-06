package day03_scanner_concatenation;

import java.util.Scanner;

public class C03ScannerClass03 {

    public static void main(String[] args) {

        //Example 3: Ask user to enter full name, age, height, marital status
        //           Then print them on the console in different lines with a label

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name, age, height in cm and marital status in order please...");

        String fullName = input.nextLine();

        byte age = input.nextByte();

        int height = input.nextInt();

        String maritalStatus = input.next();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Marital Status: " + maritalStatus);

    }

}
