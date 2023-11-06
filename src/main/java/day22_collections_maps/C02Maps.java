package day22_collections_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02Maps {

    public static void main(String[] args) {

        //How to create a HashMap
        HashMap<String, Integer> stdAges = new HashMap<>();


        //How to add "entries" into a HashMap
        stdAges.put("Tom", 76);
        stdAges.put("Angelina", 55);
        stdAges.put("Brad", 61);
        stdAges.put("Leo", 43);
        stdAges.put("Linda", 23);
        stdAges.put("Brad", 34); // if you use same key with different value, it will update the value of that key
        System.out.println(stdAges); // {Tom=76, Angelina=55, Leo=43, Brad=34, Linda=23} ==> Random Order


        //How to work with just keys
        //Example 1: Get the total number of chars in student names
        Set<String> keys = stdAges.keySet(); // keySet: Returns a Set view of the keys contained in this map.
        System.out.println(keys); // [Tom, Angelina, Leo, Brad, Linda]

        int numOfChars = 0;

        for (String w: keys){
            numOfChars = numOfChars + w.length();
        }
        System.out.println(numOfChars); //23


        //How to work with just values
        //Example 2: Find the average age of the students
        Collection<Integer> values = stdAges.values();
        System.out.println(values); // [76, 55, 43, 34, 23]

        double sumOfAges = 0;

        for (Integer w: values){
            sumOfAges = sumOfAges + w;
        }
        System.out.println("Average age is " + (sumOfAges/values.size())); // 46.2


        //How to loop with entries
        //Example 3: Find the sum of the number of characters and the ages for every entry
        Set<Map.Entry<String, Integer>> entries= stdAges.entrySet();
        System.out.println(entries); // [Tom=76, Angelina=55, Leo=43, Brad=34, Linda=23]

        for (Map.Entry<String, Integer> w : entries){
            int sum = w.getKey().length() + w.getValue();
            System.out.println("For " + w.getKey() + ": " + sum);
        }

        System.out.println(stdAges.get("Angelina")); // 55 ==> get() get the key and give the value

        stdAges.putIfAbsent("Angelina", 67); // if the given key is not exist, it will put it to the map. But if its exist, do not change its' value, do nothing.
        System.out.println(stdAges); // {Tom=76, Angelina=55, Leo=43, Brad=34, Linda=23}
        stdAges.putIfAbsent("Carl", 16);
        System.out.println(stdAges); // {Tom=76, Angelina=55, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.replace("Angelina", 67); // To update values by using keys use replace() method, not put()
        System.out.println(stdAges); // {Tom=76, Angelina=67, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.replace("Angelina", 65, 35); // if the key and value are true then change the value.
        System.out.println(stdAges); // {Tom=76, Angelina=67, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.replace("Angelina", 67, 35);
        System.out.println(stdAges); //{Tom=76, Angelina=35, Leo=43, Carl=16, Brad=34, Linda=23}

        System.out.println(stdAges.containsKey("Brad")); //true
        System.out.println(stdAges.containsKey("Padme")); //false

        System.out.println(stdAges.containsValue(51)); //false

        System.out.println(stdAges.getOrDefault("Tom", 0)); // 76
        System.out.println(stdAges.getOrDefault("Padme", 0)); // 0, if the key does not exist, returns the default value that we assigned

        stdAges.remove("Tom");
        System.out.println(stdAges); // {Angelina=35, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.remove("Leo", 12); // Does not remove because key-value did not match
        System.out.println(stdAges); // {Angelina=35, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.remove("Leo", 43); // Removed because key-value matched
        System.out.println(stdAges); // {Angelina=35, Carl=16, Brad=34, Linda=23}


    }

}
