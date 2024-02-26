package com.jfs.advanceconcepts.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private String name;

    private int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList(6);
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.add(40);
//        arrayList.add(50);
//        arrayList.add(60);
//        arrayList.add(70);
        arrayList.add(null);
        arrayList.add(null);
        System.out.println("arraylist " +arrayList);
        System.out.println("arraylist size " +arrayList.size());

        if(arrayList!=null && arrayList.isEmpty()) {
            System.out.println("arraylist is empty");
        }

        ArrayList<Student> studentList = new ArrayList();
        studentList.add(new Student("nani", 1234));
        studentList.add(new Student("Prabhas", 1122));
        studentList.add(new Student("Ntr", 1133));
        studentList.add(new Student("RamCharan", 1133));
        Iterator<Student> studentIterator = studentList.iterator();
        while(studentIterator.hasNext()) {
//            Student student = studentIterator.next();
            System.out.println(studentIterator.next());
            studentIterator.remove();
        }
        System.out.println("studentList size " +studentList.size());
        for(Student student: studentList) {
            System.out.println(student);
            studentList.remove(student);
        }
    }
}
