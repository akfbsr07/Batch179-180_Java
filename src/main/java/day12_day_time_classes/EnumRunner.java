package day12_day_time_classes;

import java.util.Scanner;

public class EnumRunner {

    public static void main(String[] args) {

        String capitalCity = UsStates.MASSACHUSETTS.getCapitalCity();
        System.out.println(capitalCity);

        String abbreviation = UsStates.CALIFORNIA.getAbbreviation();
        System.out.println(abbreviation);

        System.out.println(UsStates.ALABAMA);

        //Example 1: Ask user to enter state name then give user capital city

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a state name to learn capital city...");
        String state = input.nextLine().toUpperCase();

        switch (state){

            case "ALABAMA":
                System.out.println(UsStates.ALABAMA.getCapitalCity());
                break;
            case "ALASKA":
                System.out.println(UsStates.ALABAMA.getCapitalCity());
                break;
            case "AMERICAN_SAMOA":
                System.out.println(UsStates.ALABAMA.getCapitalCity());
                break;
            case "ARIZONA":
                System.out.println(UsStates.ALABAMA.getCapitalCity());
                break;
            case "ARKANSAS":
                System.out.println(UsStates.ALABAMA.getCapitalCity());
                break;
            default:
                System.out.println("Invalid State Name");
                break;
        }




    }

}
