package day08_while_loop_do_while_loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C05DoWhileLoops03 {

    public static void main(String[] args) {

        /*
             Username is "admin", Password is "p12"
             Ask user to enter username and password
             User should see "Enter your username and password" message
             If user enters correct credentials, he should get "You are in your account!" message
             Otherwise, he should see "Enter your username and password" message 3 times
             After 3 times he should get "Your account is blocked" message
         */

        Scanner input = new Scanner(System.in);
        String username;
        String password;

        int flag = 0;

        do {

            if (flag==3){
                System.out.println("Your account is blocked");
                break;
            }

            System.out.println("Enter your username please...");
            username = input.next();
            System.out.println("Enter your password please...");
            password = input.next();

            flag++;

            if (username.equals("admin") && password.equals("p12")){
                System.out.println("You are in your account!");
                break;
            }
        }while (true);

    }

}
