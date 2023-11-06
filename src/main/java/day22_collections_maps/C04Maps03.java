package day22_collections_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class C04Maps03 {

    /*
        HashMap: 1)It does not put the entries in any order, that is why it is so fast
                 2)HashMap allows you to use null in Keys and in Values
                 3)HashMap is not thread-safe and not synchronized.

      HashTable: 1)It does not put the entries in any order, that is why it is fast, but it is slower than HashMap.
                 2)HashTable is thread-safe and synchronized.
                 3)HashTable does not allow you to use null in Keys and in Values

        TreeMap: 1)It puts the entries in natural order by using Keys, that is why it is so slow.
                 2)TreeMap does not allow you to use null in Keys, but allows you to use null in Values
                 3)TreeMap is not thread-safe and not synchronized.
     */

    public static void main(String[] args) {

        //Homework: Create a method to display number of occurrences of letters in a sentence
        //          "Java, Java, I love Java." ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1

        String s = "Java, Java, I love Java.";

        String[] sC = s.replaceAll("[^A-Za-z]", "").split("");
        System.out.println(Arrays.toString(sC)); // [J, a, v, a, J, a, v, a, I, l, o, v, e, J, a, v, a]

        HashMap<String, Integer> letters = new HashMap<>();

        for (String w: sC){
            Integer numOfOcc = letters.get(w);

            if (numOfOcc==null){
                letters.put(w, 1);
            }else {
                letters.replace(w, numOfOcc+1);
            }
        }
        System.out.println(letters); // {a=6, e=1, v=4, I=1, J=3, l=1, o=1}


        Hashtable<Integer, String> define = new Hashtable<>();
        define.put(1, "Baby");
        define.put(15, "Teenage");
        define.put(67, "Senior");
        // define.put(67, null); // NullPointerException
        // define.put(null, "Adult"); // NullPointerException
        System.out.println(define); // {15=Teenage, 67=Senior, 1=Baby}


        TreeMap<String, Integer> countries = new TreeMap<>();
        countries.put("Albania", 3);
        countries.put("Germany", 83);
        countries.put("USA", 400);
        countries.put("Belgium", 12);
        countries.put("France", 67);
        countries.put("Turkey", 80);
        countries.put("Sweden", 11);
        // countries.put(null, 120); // NullPointerException
        countries.put("UK", null);
        System.out.println(countries); // {Albania=3, Belgium=12, France=67, Germany=83, Sweden=11, Turkey=80, UK=null, USA=400} ==> Natural Order by Keys


    }

}
