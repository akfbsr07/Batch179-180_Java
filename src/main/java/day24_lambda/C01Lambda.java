package day24_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C01Lambda {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(17);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        System.out.println(findSquareOfDistinctEvens(nums));

        System.out.println(findMultiplicationOfLastDigitOfDistinctOdds(nums));

        System.out.println(findMax1(nums));

        System.out.println(findMax2(nums));

        System.out.println(findMax3(nums));

        System.out.println(findMin1(nums));

        System.out.println(findMin2(nums));

        System.out.println(findMin3(nums));

        System.out.println(findMinEvenGreaterThanSeven(nums));




    }

    //Example 1: Create a method to calculate the "sum of the squares of the distinct even elements"
    public static int findSquareOfDistinctEvens(List<Integer> list){

        return list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t, u) -> t+u);

    }


    //Example 2: Create a method to calculate the multiplication of the last digit off the distinct odd elements
    public static int findMultiplicationOfLastDigitOfDistinctOdds(List<Integer> list){

        return list.stream().distinct().filter(t-> t%2!=0).map(t->t%10).reduce(1, (t,u) -> t*u);

    }


    //Example 3: Find the maximum element in the list
    //1.WAY:
    public static int findMax1(List<Integer> list){

       return list.stream().distinct().reduce(list.get(0), (t, u)->t>u ? t : u);

    }

    //2.WAY: Put the elements in ascending order then the last element will be the maximum
    public static int findMax2(List<Integer> list){

        return list.stream().distinct().sorted().reduce((t,u)->u).get();

    }

    //3.WAY: Put the elements in descending order then the first element will be the maximum

    public static int findMax3(List<Integer> list){

        return list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();

    }


    //Homework: Find the minimum element in the list by using 3 ways

    //1.WAY
    public static int findMin1(List<Integer> list){

        return list.stream().distinct().reduce(list.get(0), (t,u)-> t<u ? t : u);

    }

    //2.Way
    public static int findMin2(List<Integer> list){

        return list.stream().distinct().sorted().findFirst().get();

    }

    //3.Way
    public static int findMin3(List<Integer> list){

        return list.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)-> u).get();

    }


    //Example 4: Create a method to find the minimum value which is greater than 7 and even from the list
    public static int findMinEvenGreaterThanSeven(List<Integer> list){

        return list.
                stream().
                distinct().
                filter(t-> t>7 && t%2==0). //you can use filter twice as well
                sorted().
                findFirst().
                get();

    }








}
