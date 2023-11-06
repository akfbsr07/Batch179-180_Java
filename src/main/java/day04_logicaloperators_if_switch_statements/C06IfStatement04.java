package day04_logicaloperators_if_switch_statements;

import java.util.Scanner;

public class C06IfStatement04 {

    public static void main(String[] args) {

        //Example 5: Type java code by using if-else if() statement
        //A school has rules for grading system
        //Below 50 - D, 50 to 59 - C, 60 to 79 - B, 80 to 100 - A
        //Ask user to enter marks and print the grade

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mark please...");

        int marks = input.nextInt();

        if (marks<0){
            System.out.println("Your mark can not be negative...");
        } else if (marks<50){
            System.out.println("Your grade is D");
        } else if (marks<60) {
            System.out.println("Your grade is C");
        } else if (marks<80) {
            System.out.println("Your grade is B");
        } else if (marks<101) {
            System.out.println("Your grade is A");
        }else {
            System.out.println("Your mark can not be more than 100...");
        }

    }


}
