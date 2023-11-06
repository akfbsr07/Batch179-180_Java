package day10_multi_dimensional_arrays_array_lists;

import java.util.Arrays;

public class c02MultiDimensionalArrays01 {

    public static void main(String[] args) {

        //How to create a multidimensional array

        int[][] a = new int[3][2];

        //How to print multidimensional array
        System.out.println(Arrays.deepToString(a)); // [[0, 0], [0, 0], [0, 0]]

        //How to add elements

        a[0][0] = 2;
        a[0][1] = 3;
        a[1][0] = 5;
        a[1][1] = 2;
        a[2][0] = 7;
        a[2][1] = 9;

        System.out.println(Arrays.deepToString(a)); // [[2, 3], [5, 2], [7, 9]]

        //Example 1: Type code to find the total number of elements in a multidimensional array
        String[][] b = {{"X", "U"}, {"a", "d", "m"}, {"T", "Y"}};

        int sum = 0;

        for (String[] w : b) {
            sum = sum + w.length;
        }
        System.out.println(sum);


        //Example 2: Print the elements which has "a" in it from a multidimensional array
        String[][] c = {{"Java", "is"}, {"easy"}, {"to", "learn"}};

        for (String[] w : c) {

            for (String u : w)
                if (u.contains("a")) {
                    System.out.print(u + " ");
                }
        }

        System.out.println();

        //Example 3: Type code to find maximum and minimum element in a two-dimensional int array

        int[][] n = {{5, 2}, {14, 9}, {7}, {13, 27}, {1, 7}};

        int max = n[0][0];

        int min = n[0][0];

        for (int[] w : n) {
            for (int u : w) {
                max = Math.max(max, u);
                min = Math.min(min, u);
            }
        }
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);


        //Example 4: Type to code to convert a multidimensional array to a one dimensional array
        //           {{5, 2}, {14, 9}, {-7}} ==> {5, 2, 14, 9, -7}

        int[][] k = {{5, 2, 3, 7}, {14, 9, -13, 1}, {-7, -27, 3}};

        int numOfElements = 0;

        for (int[] w: k)
        {
            numOfElements = numOfElements + w.length;
        }

        int[] l = new int[numOfElements]; //Make the length same with the number of elements in the two-dimensional array

        int idx = 0;

        for (int[] w : k) {

            for (int u : w) {
                l[idx] = u;
                idx++;

            }
        }

        System.out.println(Arrays.toString(l));



    }
}
