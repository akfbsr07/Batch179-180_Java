package day04_logicaloperators_if_switch_statements;

import java.util.Scanner;

public class C07IfStatement05 {

    public static void main(String[] args) {

        //Nested If Statement
        //Example 6: If a number is even then check if it is divisible by 3 or not.
        //           If it divisible by 3 the output will be "Perfect even number" otherwise "Good even number"
        //           If a number is odd then check if it is divisible by 3 or not.
        //           If it divisible by 3 the output will be "Perfect odd number" otherwise "Good odd number"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer please");
        int num = input.nextInt();

        if (num%2==0){
            if (num%3==0){
                System.out.println("Perfect even number");
            }else {
                System.out.println("Good even number");
            }
        } else {
            if (num%3==0){
                System.out.println("Perfect odd number");
            }else {
                System.out.println("Good odd number");
            }
        }

        //Note: Nested structures need more time to be executed, we do not prefer to use nested structures in Java
        //      If something needs more time to be executed, it is called "It has time complexity"


    }

}
