package day05_ternary_operator_string_manipulations;

import java.util.Scanner;

public class C02TernaryOperator02 {

    public static void main(String[] args) {

        //Example 5: Type code to check if an integer is odd and if it is even is it divisible by 3 or not

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer please...");

        int a = input.nextInt();

        Object result1 = a%2!=0 ? a + " is odd" : (a%3==0 ? a + " is even and divisible with 3" : a + " is even and can not divisible with 3");

        System.out.println(result1);


        //Example 6 (Interview Question): Type java code by using nested ternary
        //           Write a program to check if a year is leap year or not
        //           If the year is divisible by 100 then it must be divisible by 400
        //           If a year is not divisible by 100 then it must be divisible by 4

        System.out.println("Enter a year please...");

        int year = input.nextInt();

        String result2 = year%100==0 ? (year%400==0 ? "Leap year" : "Not a leap year") : (year%4==0 ? "Leap year" : "Not a leap year");

        System.out.println(result2);



    }

}
