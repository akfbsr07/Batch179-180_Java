package day03_scanner_concatenation;

import java.util.Scanner;

public class C05ScannerClass05 {

    public static void main(String[] args) {

        //Example 5: Type code gets mile from user then convert it to km (1 mile = 1.6 km)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the mile please...");

        double mile = input.nextDouble();

        System.out.println(mile + " miles" + " = " + (mile*1.6) + " kilometers");

    }

}
