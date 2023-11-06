package day02_datatypes;

import java.util.Scanner;

public class C04ScannerClass01 {

    public static void main(String[] args) {

        //Scanner Class used to get data from user

        //To be able to get data from user follow those 3 steps

        // Step 1: Create a Scanner Class Object
        Scanner input = new Scanner(System.in);

        // Step 2: Give a message to the user
        System.out.println("Enter your age:...");

        //Step 3: Get the data that user entered
        int userAge = input.nextInt();

        System.out.println(userAge);

    }

}
