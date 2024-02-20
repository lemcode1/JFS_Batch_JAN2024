package com.jfs.advanceconcepts.threads;

class Thread1 extends Thread {

    public void run() { // child thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread1 created with name: - " + Thread.currentThread().getName());
//            Thread.yield();// indicating to CPU allow the main thread to execute
           /* try {
                Thread.sleep(2000); //2 secs
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}

public class ThreadYieldExample1 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        t1.setName("nani");
        t1.start(); // child thread
        t1.join();  //
        Thread1 t2 = new Thread1();
        t2.setName("Rana");
        t2.start(); // child thread

       /* for (int i = 0; i < 5; i++) {  // main thread
            System.out.println("Main created with name: - " + Thread.currentThread().getName());
        }*/
    }
}
