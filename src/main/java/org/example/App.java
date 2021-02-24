package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Set<Integer> setToCreate = new HashSet<>();
        setToCreate.add(750);
        setToCreate.add(500);
        setToCreate.add(900);
        setToCreate.add(100);
        // Create a Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder());
        numbers.addAll(setToCreate);

        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }


    }
}
