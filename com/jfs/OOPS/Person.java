package com.jfs.OOPS;

public class Person {

    private static int a=10;
    private void walk() {
        System.out.println("Person can run");
        a=20;
    }

    void test() {
        Person person = new Person();
        person.walk();
    }
}

class Employee extends Person {
    void test() {

    }
    void walk() {
        System.out.println("Employee want to jog");
    }

    void walk(int a) {
        System.out.println("Employee want to jog");
    }
}

class Test {
    public static void main(String[] args) {
//        Person person = new Employee();
//        person.walk();
        Employee employee = new Employee();
        employee.walk();
    }
}