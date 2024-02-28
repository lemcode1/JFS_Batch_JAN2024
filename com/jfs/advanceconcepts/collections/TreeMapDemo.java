package com.jfs.advanceconcepts.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String []args) {
        //Creating a sortedmap object using Treemap
        SortedMap<Integer, String> students = new TreeMap();

//        System.out.println("First student key: "+students.firstKey());
        students.put(4,"Ravi");
        students.put(1,"Raviteja");
        students.put(3,"Balakrishna");
        students.put(2,"Chiru");
        students.put(5,"Nag");
        System.out.println("Sortedmap : students: "+students);

        //get the first key from the map
        System.out.println("First student key: "+students.firstKey());
        System.out.println("First last key: "+students.lastKey());
        System.out.println("headmap using key: "+students.headMap(3)); //<3
        System.out.println("tailmap using key: "+students.tailMap(3)); // >=3
        System.out.println("submap using key: "+students.subMap(2,4)); //2,3
    }
}
