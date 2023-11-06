package day02_datatypes;

import java.util.Scanner;

public class C05ScannerClass02 {

    public static void main(String[] args) {

        //Get user's name

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name please...");

        String userName = input.nextLine(); // nextLine() method takes all the line in a String

        System.out.println(userName);

        System.out.println("Enter your friend's first name please...");

        String friendsFirstName = input.next(); //  next() method takes just the first word in a String

        System.out.println(friendsFirstName);



    }

}
