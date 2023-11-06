package day06_string_manipulations_loops;

import java.util.Scanner;

public class C03StringManipulations03 {

    public static void main(String[] args) {

        /*
             Example 4 (***QUESTION***): Check if a password has the following conditions
                        i) It should not be empty
                        ii) It should not be just space
                        iii) It should not have spaces at the beginning and at the end
                        iv) 'i' should be a character in the password and the first occurrence of 'i' should be at index 4
                        v) 'K' should be a character in the password and last occurrence of 'K' should be at index 5
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password please");

        String pwd = input.nextLine();

        //i) It should not be empty
        boolean firstRule = pwd.isEmpty(); // isEmpty() returns true if the String empty, otherwise it returns false

        //ii) It should not be just a single space
        boolean secondRule = pwd.isBlank(); // isBlank() returns true if all chars are space in a String, otherwise it returns false
                                            // Note: isBlank() returns true for empty Strings as well

        //iii) It should not have spaces at the beginning and at the end
        boolean thirdRule = pwd.trim().equals(pwd);

        //iv) 'i' should be a character in the password and the first occurrence of 'i' should be at index 4
        boolean fourthRule = pwd.indexOf("i")==4;

        //v) 'K' should be a character in the password and last occurrence of 'K' should be at index 5
        boolean fifthRule = pwd.lastIndexOf("K")==5;

        //1.Way to give message to the user
        if (!firstRule && !secondRule && thirdRule && fourthRule && fifthRule){
            System.out.println("The password is valid");
        }else {
            System.out.println("The password is invalid");
        }

        //2.Way to give message to the user
        if (firstRule){
            System.out.println("Empty password is not accepted...");
        }
        if (secondRule) {
            System.out.println("Password can not be just empty characters...");
        }
        if (!thirdRule) {
            System.out.println("Do not use spaces at the beginning and at the end");
        }
        if (!fourthRule) {
            System.out.println("i should be in the password as fifth character for the first time");
        }
        if (!fifthRule) {
            System.out.println("K should be in the password as sixth character for the last time");
        }
        else {
            System.out.println("The password is valid");
        }


    }

}
