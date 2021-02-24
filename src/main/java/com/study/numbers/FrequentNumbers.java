package com.study.numbers;

import java.util.*;

public class FrequentNumbers {
    /**
     *
     * @param numbers A list of numbers provided by the caller. Argument is non-null. Values are any valid integer.
     * @param k The frequency of numbers the caller is interested in finding in the 'numbers' argument.
     */
    public static List<Integer> findFrequentNumbers(List<Integer> numbers, int k) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for (Integer number: numbers) {
            if(numMap.containsKey(number)){
                numMap.put(number, numMap.get(number).intValue()+ 1);
            }else{
                numMap.put(number,1);
            }
        }
        List<Integer> output = new ArrayList<>();
        for(Integer index : numMap.keySet()){
            if(numMap.get(index).intValue() == k){
                output.add(index.intValue());
            }
        }
        return output;
    }
    /**
     * Given a list of integers, return the integers occurring K times.
     * If multiple numbers match the K frequency, return a distinct list of those numbers.
     *
     *   Given [6,1,1,6,6,6,3,4]
     *   if k = 1, then return [3, 4]
     *   if k = 2, then return [1]
     *   if k = 3, then return []
     *   if k = 4, then return [6]
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,1,1,6,6,6,3,4);

        Arrays.asList(1,2,3,4)
                .forEach((k) -> {
                    System.out.println(findFrequentNumbers(numbers, k));
                });
    }
}
