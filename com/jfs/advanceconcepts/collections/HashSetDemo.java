package com.jfs.advanceconcepts.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();
        hashSet.add("A");
        hashSet.add("Z");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(12.5);
        System.out.println(hashSet);
        System.out.println(hashSet.add("Z"));

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("A");
        linkedHashSet.add("Z");
        linkedHashSet.add("B");
        linkedHashSet.add("D");
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(12.5);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.add("Z"));

    }
}
