package day08_while_loop_do_while_loop;

public class C03DoWhileLoops01 {

    public static void main(String[] args) {

        //while-loop: zero execution is possible
        int i=1;

        while (i<1){
            System.out.println("While loop");
            i++;
        }


        //do-while loop: zero execution is not possible. You will have at least 1 execution
        int k=1;

        do{
            System.out.println("Do-While loop");

            k++;

        }while (k<1);

        /*
             Note 1: Zero Execution is possible for while loop, but it is not possible for do while loop.
             Note 2: Do-While Loop is executed at least once.
             Note 3: Do-While Loop is good to use at game creation.
         */


        // Example 1: Reverse a String by using do-while loop
        String s = "Alex";

        String reversed = "";

        int t = s.length()-1;

        do{
            reversed = reversed + s.charAt(t);

            t--;
        }while (t>=0);

        System.out.println(reversed);


        //Example 2: Type code to find the sum of the integers from 7 to 10

        int x = 7;

        int sum = 0;

        do {
            sum = sum + x;

            x++;

        }while (x<11);
        System.out.println(sum);


    }

}
