package day04_logicaloperators_if_switch_statements;

import java.util.Scanner;

public class C03IfStatement01 {

    public static void main(String[] args) {

        //If it rains , I will cancel the picnic
        // condition           action

        int a = 5;
        int b = 2;

        //"if statement" is used to execute codes under some conditions
        //If the condition is true, the code will be executed otherwise, it will not be executed

        if (a%b==2){
            System.out.println("Activated...");
        }

        //Example 1: Type code the print "Even" for even integers and "Odd" for odd integers
        //           Get the numbers from the user

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer please to check if it is even or odd...");

        int userNum = input.nextInt();

        // 1.Way: 2 if statements
        if (userNum%2==0){
            System.out.println("Even");
        }

        if (userNum%2!=0){
            System.out.println("Odd");
        }

        // 2.Way: if else statement
        // else is used for the last option
        if (userNum%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        //Example 2: Type code to check if a number positive, negative or neutral

        System.out.println("Enter a number to check if it is positive, negative or neutral...");

        double num = input.nextDouble();

        if (num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        }else {
            System.out.println("Neutral");
        }

    }

}
