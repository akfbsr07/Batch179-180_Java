package day21_collections;

import java.util.LinkedList;

public class C02LinkedList02 {

    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("France");
        countries.add("Italy");
        countries.add("Albania");
        countries.add("Germany");
        countries.add("Netherlands");
        System.out.println(countries); // [France, Italy, Albania, Germany, Netherlands]

        //peek() and element() methods returns first element without removing
        //For empty lists peek() returns null.
        //For empty lists element() throws "NoSuchElementException"
        String country1 = countries.peek(); // Retrieves, but does not remove, the head (first element) of this list. It checks the first node.
                                            // Returns: the head of this list, or null if this list is empty
        System.out.println(country1); // France
        String country01 = countries.element(); // Retrieves, but does not remove, the head (first element) of this list.
                                                // Throws: NoSuchElementException – if this list is empty
        System.out.println(country01); // France

        //pop() and poll() methods return and remove the first element
        //For empty lists poll() returns null.
        //For empty lists pop() throws "NoSuchElementException"
        String c = countries.pop(); // This method is equivalent to removeFirst(). In other words, removes and returns the first element of this list.
                                    // Throws: NoSuchElementException – if this list is empty
        System.out.println(c); //France
        System.out.println(countries); //[Italy, Albania, Germany, Netherlands]

        String d = countries.poll(); // Retrieves and removes the head (first element) of this list.
                                     // Returns null if this list is empty
        System.out.println(d); // Italy
        System.out.println(countries); // [Albania, Germany, Netherlands]

    }

}
