package com.jfs.advanceconcepts.collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> empDataMap2 = new HashMap();
        empDataMap2.put(127,"Sudheer");
        empDataMap2.put(128,"Balaji");
        HashMap<Integer, String> empDataMap = new HashMap();
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
        System.out.println(empDataMap.size());
        System.out.println(empDataMap);
        System.out.println(empDataMap.get(124));
        System.out.println(empDataMap.get(11010));
        System.out.println(empDataMap.remove(126));
        System.out.println(empDataMap);
        System.out.println(empDataMap.containsKey(123));
        System.out.println(empDataMap.containsKey(11010));
        System.out.println(empDataMap.isEmpty());
//        empDataMap.clear();
//        System.out.println(empDataMap);
        System.out.println(empDataMap.keySet());
        System.out.println(empDataMap.values());
        Set<Map.Entry<Integer, String>> entrySet=  empDataMap.entrySet();
        Iterator<Map.Entry<Integer, String>> entries = entrySet.iterator();
        while(entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
//        Map.Entry<Integer, String> entry = entrySet.iterator().next();
        Hashtable hashtable = new Hashtable<>();
        hashtable.put(123, "Test");
        System.out.println(hashtable);
//        hashtable.put(null, "Test");
        System.out.println(hashtable);
        System.out.println(1 << 30);

    }

}
