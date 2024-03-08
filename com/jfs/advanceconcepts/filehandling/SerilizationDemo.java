//package com.jfs.advanceconcepts.filehandling;
//
//import java.io.*;
//
//class Employee implements Serializable {
//    String name;
//    String empid;
//
//    public Employee(String name, String empid) {
//        this.name = name;
//        this.empid = empid;
//    }
//}
//class Person implements Serializable {
//    String name;
//    int rollno;
//    String address;
//
//    public Person(String name, int rollno, String address) {
//        this.name = name;
//        this.rollno = rollno;
//        this.address = address;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", rollno=" + rollno +
//                ", address='" + address + '\'' +
//                '}';
//    }
//}
//public class SerilizationDemo {
//    public static void main(String []args) {
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        Person person = new Person("Robert", 1233, "US");
//        Employee employee = new Employee("Nani","112233");
//        try{
//            // writing objects
//            fileOutputStream = new FileOutputStream("file.txt");
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(person);
//            objectOutputStream.writeObject(employee);
//
//            objectOutputStream.close();
//            fileOutputStream.close();
//
//            //reading objects
//            FileInputStream fileInputStream = new FileInputStream("file.txt");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            objectInputStream.
//            Object object = objectInputStream.readObject(); // Object object = new Person("Robert", 1233, "US")
//            Object object2 = objectInputStream.readObject(); // Object object2 = new Employee("Nani", "112233");
//            System.out.println(object);
//            System.out.println(object2);
//            if(object instanceof Person) {
//               Person person1 = (Person) object;
//               System.out.println(person1);
////               System.out.println(person1.name);
////                System.out.println(person1.address);
////                System.out.println(person1.rollno);
//            } else {
//                System.out.println(object);
//            }
////            System.out.println();
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
