package day04_logicaloperators_if_switch_statements;

import java.util.Scanner;

public class C08SwitchStatement {

    public static void main(String[] args) {

        //Example 1: Type code gives you the name of the day after giving number of the day
        //           1 ==> Sunday , 2 ==> Monday ... 7 ==> Saturday

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number to see the day name...");
        int dayNum = input.nextInt();

        //1.Way:
        if(dayNum==1){
            System.out.println("Sunday");
        } else if (dayNum==2) {
            System.out.println("Monday");
        } else if (dayNum==3) {
            System.out.println("Tuesday");
        } else if (dayNum==4) {
            System.out.println("Wednesday");
        } else if (dayNum==5) {
            System.out.println("Thursday");
        } else if (dayNum==6) {
            System.out.println("Friday");
        } else if (dayNum==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("Enter a valid day number please...");
        }

        //2.Way:
        switch (dayNum){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid day number please...");
                break; //Default is the last part in the switch statement, that is why using break after default part is optional.
        }

        //Note: You can use int, byte, short, char, String in Switch Statement
        //      Float, double, long, boolean can not be used in Switch Statement



    }

}
