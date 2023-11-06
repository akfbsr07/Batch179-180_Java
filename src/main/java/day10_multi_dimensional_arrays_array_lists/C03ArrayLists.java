package day10_multi_dimensional_arrays_array_lists;

import java.util.ArrayList;

public class C03ArrayLists {

    public static void main(String[] args) {

        /*
              1)It is impossible to create an Array without declare the number of elements in it
                This is not good, because it is impossible to decide number of elements you will put into an array at the beginning

                Arrays are fixed in length, this creates issues in implementation,
                that is why Java creates another structure which is flexible for length. Its name is "ArrayList".

                Arrays use primitive and references in data types, but ArrayLists just use non-primitives

                Why did no Java remove Arrays after creating ArrayLists?
                Because 1)Arrays are so fast, 2)Arrays are use memory less

                ArrayLists are for storing multiple data in the same data type with flexible length
                Arraylists do not accept primitive data types in elements, you have to use non-primitive data types
         */

        //How to create an ArrayList
        ArrayList<Integer> m = new ArrayList<>();

        //How to print ArrayLists
        System.out.println(m); //Just put the name of ArrayList

        //How to add elements in to a List(ArrayList)
        m.add(12);
        m.add(5);
        m.add(9); //add(element) method adds the elements to the end
        m.add(1, 3);
        m.add(4, 7);  //add(given index, element) method adds element to the given index
        m.add(3, 13);
        System.out.println(m);

        ArrayList<Integer> n = new ArrayList<>();

        n.add(99);
        n.add(88);
        n.add(77);
        System.out.println(n);

        m.addAll(n);
        m.addAll(2, n);
        System.out.println(m);

        //Example 1: Create an Integer ArrayList and change the odd ones to 11

        ArrayList<Integer> p = new ArrayList<>();
        p.add(23);
        p.add(24);
        p.add(12);
        p.add(9);
        p.add(3);

        System.out.println(p); // [23, 24, 12, 9, 3]

        for (Integer w: p){
            if (w%2!=0){
                p.set(p.indexOf(w), 11); // indexOf() Returns the index of the first occurrence of the specified element in the list
            }                            // or -1 if this list does not contain the element
        }                                // set() Replaces the element at the specified position in this list with the specified element

        System.out.println(p); // [11, 24, 12, 11, 11]


        //Example 2: Create a String ArrayList and remove the elements contain a
        ArrayList<String> r = new ArrayList<>();

        r.add("Miami");
        r.add("New York");
        r.add("Tampa");
        r.add("Virginia");
        System.out.println(r);

        for (int i=0; i<r.size(); i++){  // size() Returns the number of elements in the list

            String city = r.get(i); // get() Returns the element at the specified position in the list

            if (city.contains("a")){

                r.remove(city); // remove() Removes the first occurrence of the specified element from this list, if it is present
                                // If the list does not contain the element, it is unchanged
                i--;

            }
        }
        System.out.println(r);




    }

}
