package java_practice_01;

import java.util.Scanner;

public class Q02 {

    /*
       Take a number from user and,
       i)Check if it is less than 0, print "Negative Number"
       ii)if it is greater than or equals to 0 and less than 10, print "Positive Digit"
       iii)if it is greater than or equals to 10, print "Positive Number"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer please...");
        int a = input.nextInt();

        if (a<0){
            System.out.println("Negative Number");
        }else {
            if (a<10){
                System.out.println("Positive Digit");
            }else {
                System.out.println("Positive Number");
            }
        }



    }

}
