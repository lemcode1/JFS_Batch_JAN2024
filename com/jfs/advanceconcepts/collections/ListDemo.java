package com.jfs.advanceconcepts.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args){
        List<String> nameList = new ArrayList<String>();
        nameList.add("Sagar");
        nameList.add("Nani");
        // adding one value in the end
        nameList.add("Vinay");
        System.out.println(nameList);
        // add single value at a speicified position
        nameList.add(0, "Spandana");
        System.out.println(nameList);

        List<String> nameList2 = new ArrayList();
        nameList2.add("Charan");
        nameList2.add("Santhosh");
        // add multiple values at a time in the end
        nameList.addAll(nameList2);
        System.out.println(nameList);
        List<String> nameList3 = new ArrayList();
        nameList3.add("Vinay");
        nameList3.add("Santhosh Girls Batch");
        // add multiple values at a time in specified position
        nameList.addAll(2, nameList3);

//        nameList.add(1234);
        System.out.println(nameList);
        //methods to remove
        nameList.remove("Nani");
        System.out.println(nameList);
        nameList.remove("Vinay");
        System.out.println(nameList);
        nameList.remove(1);
        System.out.println(nameList);

        // get the elements from a list
        System.out.println(nameList.get(3));
//        System.out.println(nameList.get(21));
       /* for(int i=0; i<nameList.size() ; i++) {
            System.out.println(nameList.get(i));
        }*/

        // public ListIterator listIterator();
        // [Spandana, Santhosh Girls Batch, Vinay, Charan, Santhosh]
        ListIterator listIterator = nameList.listIterator();
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.next());
        System.out.println("Forward direction");
        while (listIterator.hasNext()) {
            System.out.println(listIterator);
            System.out.println(listIterator.next());
        }
        System.out.println("Backward direction");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
