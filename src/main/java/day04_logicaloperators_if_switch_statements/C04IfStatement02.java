package day04_logicaloperators_if_switch_statements;

import java.util.Scanner;

public class C04IfStatement02 {

    public static void main(String[] args) {

        //Example 3: Ask user to enter initial of the day names, then print the all possible day names on the console
        //           M==> Monday , T==> Tuesday,Thursday , W==> Wednesday , F==> Friday , S==>Saturday, Sunday

        Scanner input = new Scanner(System.in);
        System.out.println("Enter initial of a day please...");
        char initialOfDay = input.next().toUpperCase().charAt(0);

        if (initialOfDay=='M'){
            System.out.println("Monday");
        } else if (initialOfDay=='T') {
            System.out.println("Tuesday, Thursday");
        } else if (initialOfDay=='W') {
            System.out.println("Wednesday");
        } else if (initialOfDay=='F') {
            System.out.println("Friday");
        } else if (initialOfDay=='S') {
            System.out.println("Saturday, Sunday");
        }else {
            System.out.println("Enter a valid day please...");
        }
    }

}
