package day09_arrays_for_each_loop;

import java.util.Arrays;

public class C01Arrays01 {

    public static void main(String[] args) {

        //To learn a new topic, follow the steps:
        // i)What is it
        // ii)Why we need it
        // iii)Simple implementations
        // iv)Mid-level implementations
        // v)Advanced-level implementations
        // vi)Projects


        /*
             1)Array is a data structure, used to "store multiple data" in the "same data type".
             2)When you create an Array, you have to declare the number of elements(length) in the array
         */

        //How to create an Array
        String[] stdNames = new String[5];

        //How to print an Array to the console
        System.out.println(stdNames); //Reference of the Array
        System.out.println(Arrays.toString(stdNames)); // Array elements

        //How to add elements in to an Array
        stdNames[0] = "Tom";
        stdNames[3] = "Mary";
        stdNames[1] = "Mark";
        stdNames[4] = "Hanks";
        stdNames[2] = "Jim";
        System.out.println(Arrays.toString(stdNames));

        //How to get a specific element from an array by using index
        String fourth = stdNames[3];
        System.out.println(fourth);

        //Example 1: Create an integer array, then find the multiplication of all elements

        //1.Way
        int[] ages = new int[4];

        ages[0]=12;
        ages[1]=5;
        ages[2]=7;
        ages[3]=1;

        int i = 0;

        int multip = 1;

        while (i<ages.length){

            multip = multip*ages[i];

            i++;
        }
        System.out.println(multip);


        //2.Way: for-each loop (Enhanced Loop)
        //       for-each loop is so easy to use so if it is possible we prefer to use for-each loop
        //       Sometimes we need to work with indexes, if you need to use indexes, using for-each loop is not possible
        //       for-each loop can be used only with the Arrays and Collections
        int result = 1;

        for (int w : ages){
            result = result*w;
        }
        System.out.println(result);


        //Example 2: Find the difference between maximum and minimum value of array elements
        //           [8, 12, 34, 10, 78, 19] ==> 78-8=70

        //1.Way
        int[] nums = {8, 12, 34, 10, 78, 19};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums)); //[8, 10, 12, 19, 34, 78]

        int first = nums[0];
        int last = nums[nums.length-1];

        System.out.println(last-first);

        //2.Way
        int[] numbers = {8, 12, 34, 10, 78, 19};

        int maximum = nums[0];

        int minimum = nums[0];

        for (int w : numbers){
           maximum = Math.max(maximum, w);
           minimum = Math.min(minimum, w);
        }
        System.out.println(maximum-minimum);


    }

}
