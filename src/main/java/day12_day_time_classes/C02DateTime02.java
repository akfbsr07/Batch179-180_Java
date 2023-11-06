package day12_day_time_classes;

import java.time.LocalDate;
import java.util.Scanner;

public class C02DateTime02 {

    public static void main(String[] args) {

        //Example 5: Ask user to enter his date of birth, then tell user to day that he/she was born

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year, month and day number");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate dob = LocalDate.of(year, month, day);

        System.out.println("You were born on " + dob.getDayOfWeek());

    }

}
