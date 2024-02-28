package com.jfs.advanceconcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> empDataMap2 = new LinkedHashMap();
        empDataMap2.put(127,"Sudheer");
        empDataMap2.put(128,"Balaji");
        LinkedHashMap<Integer, String> empDataMap = new LinkedHashMap();
        System.out.println(empDataMap.isEmpty());
        System.out.println(empDataMap.size());
        empDataMap.put(125, "Ravi");
        empDataMap.put(126, "Raju");
        empDataMap.put(123, "Chandu P");
        empDataMap.put(124, "Chandu P");
        empDataMap.put(126, "NTR");
        empDataMap.put(129, null);
        empDataMap.put(130, null);
        empDataMap.put(null, "Nani");
        empDataMap.put(null, "Rana");
        empDataMap.putAll(empDataMap2);
        System.out.println(empDataMap);
    }
}
