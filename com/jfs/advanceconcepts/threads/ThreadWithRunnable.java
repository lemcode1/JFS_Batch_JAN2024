package com.jfs.advanceconcepts.threads;

import javax.print.attribute.standard.RequestingUserName;

class NumberGenerator implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside run method");

    }
}
public class ThreadWithRunnable {
    public static void main(String []args) {
        /*Runnable obj = () -> {
          System.out.println("Inside runnable implementation");
        };*/
//        Thread t1 = new Thread(new NumberGenerator());
        Thread t1 = new Thread(() -> {
            System.out.println("Inside runnable implementation");
        });
        t1.start();
    }
}
