package day04_logicaloperators_if_switch_statements;

import java.util.Scanner;

public class C05IfStatement03 {

    public static void main(String[] args) {

        //Example: Type code to decide a day name is weekday or weekend

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of week please...");
        String weekDay = input.next().toUpperCase(); //You can use equalsIgnoreCase() method below also

        boolean isWeekDay = weekDay.equals("MONDAY")
                || weekDay.equals("TUESDAY")
                || weekDay.equals("WEDNESDAY")
                || weekDay.equals("THURSDAY")
                || weekDay.equals("FRIDAY");

        boolean isWeekEnd = weekDay.equals("SATURDAY")
                || weekDay.equals("SUNDAY");

        if (isWeekDay){
            System.out.println("It is a weekday");
        }
        else if (isWeekEnd) {
            System.out.println("It is a weekend day");
        }
        else{
            System.out.println("Enter a valid week day please...");
        }

    }

}
