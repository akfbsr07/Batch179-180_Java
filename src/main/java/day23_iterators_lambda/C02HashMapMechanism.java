package day23_iterators_lambda;

import java.util.HashMap;

public class C02HashMapMechanism {

    /*
        1)HashMap is not "thread-safe" and is not "synchronized"
        2)Learn and Explain HashMap Mechanism
          i)When you create a HashMap, Java gives you 16 "bucket"s
          ii)Java indexes every bucket from 0 to 15
          iii)When you put a new entry into the map,
              a)Java creates "hashcode" for the key
              b)Divides the hashcode by 16, then remainder is the index of the bucket
          iv)Java puts the entry into the bucket whose index is found in step "iii.b"
          v)If Java needs to put multiple entries into a bucket, Java uses "Linked List" structure inside the bucket
          vi)If "75%" of the existing buckets is full, Java creates a new 16 buckets
          vii)To find an entry, Java follows the following steps
              Bucket --> HashCode --> Key, then return the value
     */

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Albania", 3);

        hm.put("USA", 400);

        hm.put("UK", 65);

        hm.get("UK");

    }

}
