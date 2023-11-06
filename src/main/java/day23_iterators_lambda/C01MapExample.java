package day23_iterators_lambda;

import java.util.Arrays;
import java.util.HashMap;

public class C01MapExample {

    public static void main(String[] args) {

        //Example 1: Create a method to display the number of occurrences of letters in a sentence(Java, Java, I love Java.)

        String s = "Java, Java, I love Java.";

        String[] sc = s.replaceAll("[^A-Za-z]", "").split("");
        System.out.println(Arrays.toString(sc)); // [J, a, v, a, J, a, v, a, I, l, o, v, e, J, a, v, a]

        HashMap<String, Integer> letters = new HashMap<>();

        for (String w: sc){
            Integer numOfOcc = letters.get(w);

            if (numOfOcc==null){
                letters.put(w, 1);
            }else {
                letters.replace(w, numOfOcc+1);
            }

        }
        System.out.println(letters); // {a=6, e=1, v=4, I=1, J=3, l=1, o=1}
    }

}
