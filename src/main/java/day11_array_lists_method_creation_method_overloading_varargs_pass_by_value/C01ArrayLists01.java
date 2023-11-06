package day11_array_lists_method_creation_method_overloading_varargs_pass_by_value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01ArrayLists01 {

    public static void main(String[] args) {

        //From a given list find all pairs whose sum is a given number
        //{4, 6, 5, -10, 8, 5, 20} ==> 10
        //For example: 4+6=10, 5+5=10, -10+20=10

        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(-10);
        a.add(8);
        a.add(5);
        a.add(20);

        int sum = 10;

        for (int i =0 ; i<a.size() ; i++){

            for (int k= i+1 ; k<a.size() ; k++){

                if (a.get(i)+a.get(k)==sum){

                    System.out.println(a.get(i) + " and " + a.get(k));
                }
            }
        }

        //Short syntax to create a list and add elements into it
        List<Integer> n = Arrays.asList(4, 6, 5, -10, 8, 5, 20);

        System.out.println(n); // [4, 6, 5, -10, 8, 5, 20]

        //n.remove(6);

        //n.add(11);

        //n.clear();

        n.set(1, 22);
        System.out.println(n); // [4, 22, 5, -10, 8, 5, 20]

        //Note: If you create a list by using Arrays.asList() method, you can not use the ArrayList methods change the
        //      number of elements in the list. For example; remove(), add(), clear(). But you can use set(), size() like do not changing number of elements.



    }

}
