package day09_arrays_for_each_loop;

import java.util.Arrays;

public class C02Arrays02 {

    public static void main(String[] args) {

        //Example 3: Create a String Array, add 5 elements in it, find the sum of the number of characters in all Strings

        String[] cities = {"Miami", "Alabama", "Jacksonville", "Tampa", "Orlando"};

        int sum = 0;

        for (String w : cities){
            sum = sum + w.length();
        }
        System.out.println(sum);

        //Note 1: Arrays can contain just "primitive data types" and "references".
        //Note 2: Strings use "length()" method but Arrays use "length" variable.


        //Example 4: [0, 2, 3, 0, 12, 0] put zeros to the end ==> [2, 3, 12, 0, 0, 0]

        int[] arr1 = {0, 2, 3, 0, 12, 0};

        int[] arr2 = new int[arr1.length];

        int idx = 0;

        for (int w: arr1){
            if (w!=0){
                arr2[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr2));



    }

}
