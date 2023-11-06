package day05_ternary_operator_string_manipulations;

import java.util.Scanner;

public class C01TernaryOperator01 {

    public static void main(String[] args) {

        //Example 1: Type code check if an integer is even or odd

        int a = 7;

       String result1 = a%2==0 ? "Even" : "Odd" ;

        System.out.println(result1);


        //Example 2: Type code to check if an integer has 3 digits or not
        int b = 415;

        String result2 = b>99 && b<1000 ? b + " has 3 digits" : b + " does not have 3 digits" ;

        System.out.println(result2);


        //Example 3: Type code to calculate absolute value of a number
        //           3 ==> 3 , 0 ==> 0, -7 ==> 7

        double c = -12.7;

        double result3 = c<0 ? c*-1 : c ;

        System.out.println(result3);


        //Example 4: Type code to find the multiplication of two integers if the signs are same.
        //           Give a message "I do not know how to multiply" if the signs are different

        int d = 7;
        int e = 3;

        Object result4 = (d<0 && e <0) || (d>0 && e>0) || (d==0 && e==0) ? d*e : "I do not know how to multiply" ;

        System.out.println(result4);


    }

}
