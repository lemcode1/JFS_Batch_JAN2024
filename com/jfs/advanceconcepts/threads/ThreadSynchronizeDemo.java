package com.jfs.advanceconcepts.threads;

class Hello {
    public synchronized void sayHello(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello:-  " + name);
        }
    }
}

class CustomThread extends Thread {
    Hello hello;
    String name;

    public CustomThread(Hello hello, String name) {
        super();
        this.hello = hello;
        this.name = name;
    }

    public void run() {
        hello.sayHello(name);
    }
}


public class ThreadSynchronizeDemo {
    public static void main(String[] args) {
        Hello hello = new Hello();
        CustomThread t1 = new CustomThread(hello, "ram");
        CustomThread t2 = new CustomThread(hello, "mohan");
        t1.start();
        t2.start();
    }
}
