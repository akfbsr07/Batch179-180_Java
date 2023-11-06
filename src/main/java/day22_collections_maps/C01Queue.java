package day22_collections_maps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01Queue {

    /*
        1)Whenever you need "FIFO"(First In First Out) scenarios, remember to use "Queue"s.
        2)You have two options to use Queues; i)LinkedList   ii)PriorityQueue: Uses priority order.
        3)Deque is an interface, stands for "Double Ended Queue", use it whenever you need to work with FIFO(first in first out) and LIFO(last in first out)
     */

    public static void main(String[] args) {

        Queue<String> food = new LinkedList<>();
        food.add("Meat");
        food.add("Cheese");
        food.add("Egg");
        food.add("Fruit");
        food.add("Candy");
        System.out.println(food); // [Meat, Cheese, Egg, Fruit, Candy] ==> Insertion Order

        PriorityQueue<String> f = new PriorityQueue<>();
        f.add("Meat");
        f.add("Cheese");
        f.add("Egg");
        f.add("Fruit");
        f.add("Candy");
        System.out.println(f); // [Candy, Cheese, Egg, Meat, Fruit] ==> Java's priority logic that we do not know

        Deque<String> g = new LinkedList<>();
        g.addFirst("A");
        g.addFirst("B");
        System.out.println(g); // [B, A]
        g.add("X");
        System.out.println(g); // [B, A, X]
        g.addLast("Y");
        g.addFirst("X");
        g.addFirst("A");
        System.out.println(g); // [A, X, B, A, X, Y]

        g.removeFirst(); // Retrieves and removes the first element of this deque.
        System.out.println(g); // [X, B, A, X, Y]
        g.removeLastOccurrence("X");
        System.out.println(g); // [X, B, A, Y]

        System.out.println(g.getFirst()); //X
        System.out.println(g.getLast()); //Y


    }






}
