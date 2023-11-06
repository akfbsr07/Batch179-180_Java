package day08_while_loop_do_while_loop;

public class C02WhileLoops02 {

    public static void main(String[] args) {

        //Example 3: Type code to find the sum of digits of an integer

        int n = 31232495;

        int sumOfDigits = 0;

        while (n>0){

            sumOfDigits = sumOfDigits + n%10;

            n = n/10;
        }
        System.out.println("Sum of the digits are " + sumOfDigits);


        //Example 4: Type code to create multiplication table for the given integer

        int k = 7;

        int i=1;

        while (i<11){

            System.out.println(k + " x " + i + " = " + (k*i));

            i++;
        }


    }

}
