package java_practice_01;

import java.util.Scanner;

public class Q01 {

    /*
        Ask user to enter his/her first name, last name, age, height and weight then print them on console this way:

        First Name: ...
        Last Name: ...
        Age: ...
        Height: ...
        Weight: ...

        Note: Use only one "System.out.print.ln();"

             */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name, last name, age, height and weight by order please");

        String name = input.next();
        String lastName = input.next();
        int age = input.nextInt();
        double height = input.nextDouble();
        int weight = input.nextInt();

        System.out.println("First name: " + name + "\n" + "Last name: " + lastName + "\n" + "Age: " + age + "\n" + "Height: " + height + "\n" + "Weight: " + weight);





    }

}
