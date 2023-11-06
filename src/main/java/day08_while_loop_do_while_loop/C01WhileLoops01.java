package day08_while_loop_do_while_loop;

import java.util.Scanner;

public class C01WhileLoops01 {

    public static void main(String[] args) {

        //Example 1: Type code to print even integers from 14 to 8 on the console

        int i = 14;

        while (i > 7) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }

        /*
            Note: Infinite Loop is a risk in using loops.
                  If you forget to type increment or decrement part in the loops you will have infinite loop and Java will
                  stick over there it means your application will freeze. Same thing if you use increment or decrement wrong way
         */

        System.out.println();

        //Example 2: Type code to check if a given integer palindrome or not
        //           Palindrome: 121 <==> 121       123321 <==> 123321

        int k = -12155121;

        k = Math.abs(k);

        String m = String.valueOf(k);

        String reversed = "";

        int n = m.length()-1;

        while (n>=0){
           reversed = reversed + m.charAt(n);
           n--;
        }
        System.out.println(reversed);

        if (m.equals(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


    }
}