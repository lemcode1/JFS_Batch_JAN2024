package com.jfs;

import java.util.*;


public class Programs {

    /**
     * Write a simple Java program which will print Fibonacci series,
     *  e.g. 0 1 1 2 3 5 8 13 ....  up to a given number
     *
     *  0 1 1 2 3 5 8 13 21 ....
     *
     *  Step 1: Ask user input how many numbers he want to generate
     *  Step 2 : We need to initialize first two values
     *  Step 3 : Sum first two values  -> nextValue
     *  Step 4 : we need replace current value with next value after sum
     *  Step 5 : Keep step3,4 loop
     */
    public static void fibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want:");
        int number = sc.nextInt();
        int firstValue = 0;
        int secondValue = 1;
        for(int i=1; i<=number; i++) {
            System.out.print(firstValue + " ");
            int sum = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = sum;
        }
    }

    /**
     *
     */
    public static void removeDuplicatesFromArray() {
        int a[] = {10,20,30,20,10,40,20}; // {10,20,30,40}
        // TreeSet, LinkedHashSet, HashSet
        Set<Integer> set = new LinkedHashSet();
        for(int i=0; i<a.length ; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
    }

    /**
     * Java Program to Count the Occurrences of Each Character
     *  Sample input :
     *  java
     * Sample output :
     * j available 1 time
     * a available 2 times
     * v available 1time
     *
     * Step1 : Take input string
     * Step2 : Iterate String using any loop
     * Step3 : Declare a counter to increase count of each character
     * Step4 : Finally print them using any loop
     *
     * @param value
     */
    public static void countOccuranceOfString(String value) {
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap();
        char[] charArray = value.toCharArray();
        for(int i=0; i<charArray.length ; i++) {
//            System.out.println(charArray[i]);
            if (hashMap.containsKey(charArray[i])) {
                hashMap.put(charArray[i], hashMap.get(charArray[i]) + 1);
            } else {
                hashMap.put(charArray[i], 1);
            }
        }

        System.out.println(hashMap);
        Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();
        for(Map.Entry entry: entrySet) {
            System.out.println(entry.getKey() + " available " + entry.getValue() +" time(s)");
        }
    }

    public static void main(String[] args) {
        //fibonacciSeries();
       // removeDuplicatesFromArray();
        countOccuranceOfString("java");
    }

}
