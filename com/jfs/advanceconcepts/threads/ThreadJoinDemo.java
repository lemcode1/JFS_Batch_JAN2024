package com.jfs.advanceconcepts.threads;

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {  // 10secs
            System.out.println("thread1 "+ Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 thread1 = new MyThread1();
        thread1.setName("Thread1");
        thread1.start(); // child thread
        thread1.join(3000);
        MyThread1 thread2 = new MyThread1();
        thread2.setName("Thread2");
        thread2.start(); // child thread
//        thread2.join();
        MyThread1 thread3 = new MyThread1();
        thread3.setName("Thread3");
        thread3.start(); // child thread
        /*for (int i = 0; i < 5; i++) {  // main thread
            System.out.println("main thread");
        }
        thread1.join();*/
    }
}
