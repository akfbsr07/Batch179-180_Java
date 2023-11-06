package day09_arrays_for_each_loop;

import java.util.Arrays;

public class C03Arrays03 {

    public static void main(String[] args) {

        //Example 5: Create an integer array and print all elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3

        int[] arr1 = {12, 3, -3, 5, 23, 1, -13, 33, 77};

        for (int w: arr1){
            if (w<5){
                System.out.print(w + " ");
            }
        }

        System.out.println();

        //Example 6: Check if a specific element exist in an array or not

        int[] arr2 = {12, 3, 14, 5, 23, 1, -13, 33, 77};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); //[-13, 1, 3, 5, 12, 14, 23, 33, 77]

        int result = Arrays.binarySearch(arr2, -13); //2
        System.out.println(result); // binarySearch() method gives you the index of the existing element
                                    // binarySearch() method can not used with repeated elements
                                    // Before using binarySearch() method you have to use sort()

        int r = Arrays.binarySearch(arr2, 11);
        System.out.println(r); // -5 ==> "-" means does not exist.
                               // 5 means if it exists it would be the 5th element



    }

}
