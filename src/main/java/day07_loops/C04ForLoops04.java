package day07_loops;

public class C04ForLoops04 {

    public static void main(String[] args) {

        //Example 8: Print the following structure on the console ( 4 weeks 7 days)
        /*
              Week: 1
              Day: 1
              Day: 2
              Day: 3
              .
              .
              .
              Week: 2
              Day: 1
              Day: 2
              Day: 3
              .
              .
              .
         */

        int week = 4;
        int day = 7;

        for (int i=1; i<=week; i++){

            System.out.println("Week: " + i);

            for (int k=1; k<=day; k++){
                System.out.println(" Day: " + k);
            }

        }

















    }

}
