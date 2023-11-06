package day23_iterators_lambda;

/*
    1)"Iterators" do the same things with the "loops"
    2)"loops" can create infinite loops, this is risk for developers.
      "Iterators" do not have this risk.
    3)There is no any performance difference between Iterators and Loops
    4)There are 2 type of Iterators; i)Iterator: It can just "remove" the elements form a collection
                                                 It can not update or add operations
                                                 It works just from left to right (first element to last element)

                                     ii)ListIterator: It can remove, update and add operations
                                                      It works from left to right and  right to left
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04Iterators {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); // [Tom, Jim, Clara, Angie, Mark]

        //Type code to remove all elements except Clara from the given list by using Iterator
        Iterator<String> itr = myList.iterator();


        while (itr.hasNext()){  // Iterator puts a pointer before the first element, and if its element exist,
            String el = itr.next(); // moves right

            if(!el.equals("Clara")){
                itr.remove();
            }
        }
        System.out.println(myList); // [Clara]


        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jim");
        list.add("Clara");
        list.add("Angie");
        list.add("Mark");
        System.out.println(list); // [Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> litr = list.listIterator();

        //Type code to print all elements in reverse order by adding "!" to the end
        //Mark! Angie! Clara! Jim! Tom!

        while (litr.hasNext()){
            litr.next();
        }

        while (litr.hasPrevious()){
            String el = litr.previous();

            System.out.print(el+ "! ");
        }










    }

}
