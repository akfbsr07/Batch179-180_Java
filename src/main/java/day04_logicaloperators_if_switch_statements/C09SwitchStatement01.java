package day04_logicaloperators_if_switch_statements;

import java.util.Scanner;

public class C09SwitchStatement01 {

    public static void main(String[] args) {

        //Example 2: Ask user to enter month name then print month names from the given month name to the last month name

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month name please");

        String month = input.next().toUpperCase();

        switch (month){
            case "JANUARY":
                System.out.println("January");

                case "FEBRUARY":
                System.out.println("February");

                case "MARCH":
                System.out.println("March");

                case "APRIL":
                System.out.println("April");

                case "MAY":
                System.out.println("May");

                case "JUNE":
                System.out.println("June");

                case "JULY":
                System.out.println("July");

                case "AUGUST":
                System.out.println("August");

                case "SEPTEMBER":
                System.out.println("September");

                case "OCTOBER":
                System.out.println("October");

                case "NOVEMBER":
                System.out.println("November");

                case "DECEMBER":
                System.out.println("December");
                break;

            default:
                System.out.println("Enter a valid month name...");
                break;
        }



    }

}
