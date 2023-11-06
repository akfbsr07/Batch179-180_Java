package day07_loops;

import java.util.Scanner;

public class C05ForLoops05 {

    public static void main(String[] args) {

        //Example 9 (***QUESTION***): Type code to print fibonacci numbers, the number of fibonacci numbers will be given by user
        //           The user gave 6 ==> 1 1 2 3 5 8

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of fibonacci numbers you want to see...");

        int n = input.nextInt();

        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;

        System.out.print(fibo1 + " " + fibo2 + " ");

        for (int i=1; i<n-1; i++){

            fibonacci=fibo1+fibo2;
            System.out.print(fibonacci+" ");
            fibo1=fibo2;
            fibo2=fibonacci;

        }



    }

}
