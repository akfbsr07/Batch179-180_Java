package day22_collections_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03Maps02 {

    //Example 1: Type code to find the number of occurrences of words in a sentence (***VERY COMMON INTERVIEW QUESTION***)
    //          "Java is easy, Java is OOP, OOP makes Java easy." ==> Java=3, is=2, easy=2, OOP=2, makes=1

    public static void main(String[] args) {

        String s = "Java is easy, Java is OOP, OOP makes Java easy.";
        System.out.println(s); // Java is easy, Java is OOP, OOP makes Java easy.

        //To make "easy," and "easy." same remove all punctuation marks
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s); // Java is easy Java is OOP OOP makes Java easy

        //Create a map
        HashMap<String, Integer> occ = new HashMap<>();

        //Get the words from the String by using split (" ")
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words)); // [Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]

        //Put the words in to map by counting
        for (String w : words){

            Integer numOfOcc = occ.get(w);

            if (numOfOcc==null){
                occ.put(w, 1);
            }else {
                occ.replace(w, numOfOcc+1);
            }
        }

        System.out.println(occ); // {Java=3, OOP=2, makes=1, is=2, easy=2}

    }



}
