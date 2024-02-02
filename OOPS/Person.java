package OOPS;

public class Person {
    void walk() {
        System.out.println("Person can run");
    }
}

class Employee extends Person {
    void walk() {
        System.out.println("Employee want to jog");
    }

    void walk(int a) {
        System.out.println("Employee want to jog");
    }
}

class Test {
    public static void main(String[] args){
        Person person = new Employee();
        person.walk();
    }
}