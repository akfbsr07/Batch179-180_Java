package day08_while_loop_do_while_loop;

import java.util.Scanner;

public class C04DoWhileLoops02 {

    public static void main(String[] args) {

        /*
              Ask user to enter an integer
              If the integer less than 100, tell user "Won!"
              Otherwise, tell user "Lost!"
         */

        //1.Way
        Scanner input = new Scanner(System.in);
        int i;

        do {
            System.out.println("Enter an integer...");
            i = input.nextInt();
            if (i<100){
                System.out.println("Win!");
            }
        }while (i<100);
        System.out.println("Lost!");


        //2.Way
        int k=0;

        do {
            System.out.println("Enter an integer...");
            k=input.nextInt();
            if (k>99){
                System.out.println("Lost!");
                break;
            }else{
                System.out.println("Won!");
            }
        }while (true);



    }

}
