package com.jfs.advanceconcepts.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String name = sc.nextLine();
//        System.out.println("Enter emp no:");
//        String empNo = sc.nextLine();
//        System.out.println("Enter emp salary:");
//        String salary = sc.nextLine();
//        int name = "nani";
//        String empNo = "1234";
//        String salary = "12345.00";
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList.size());
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        String sal = linkedList.get(2).toString();
        System.out.println(sal);
        sal = String.valueOf((Double.parseDouble(sal) + 25000));
        System.out.println(sal);

        // Retrieving data of linkedlist using toArray()
        Object[] objects = linkedList.toArray();
        int sum=0;
        for(int i=0;i< objects.length ; i++) {
            System.out.println(objects[i]);
            Integer val = (Integer)objects[i];
            sum+=val;  // int + Integer(10)
        }
        System.out.println("Final sum of ll :"+sum);

    }
}
