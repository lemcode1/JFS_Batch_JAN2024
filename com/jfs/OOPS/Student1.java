package com.jfs.OOPS;

public class Student1 {
    int rollno;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        /*if(name != null) {
            this.name = name;
        } else {
            this.name = "";
        }*/
        this.name = name == null ? "" : name;
    }

    public Student1(){

    }
}

class DemoMain {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.setName("Kasi");
        if (student1.getName().equalsIgnoreCase("Kasi")) {
            System.out.println("It is Kasi's class");
        } else{
            System.out.println("you are in wrong meeting room");
        }

    }
}
