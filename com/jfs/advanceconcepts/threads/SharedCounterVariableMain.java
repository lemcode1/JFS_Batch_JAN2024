package com.jfs.advanceconcepts.threads;


//Counter.java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}

//IncrementThread.java
class IncrementThread extends Thread {
    private Counter counter;
    private int incrementsPerThread;
    public IncrementThread(Counter counter, int incrementsPerThread) {
        this.counter = counter;
        this.incrementsPerThread = incrementsPerThread;
    }
    @Override
    public void run() {
        for (int i = 0; i < incrementsPerThread; i++) {
            counter.increment();
        }
    }
}


//SharedCounterVariableMain.java
public class SharedCounterVariableMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numThreads = 6;
        int incrementsPerThread = 10000;
        IncrementThread[] threads = new IncrementThread[numThreads];

        // Create and start the threads
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new IncrementThread(counter, incrementsPerThread);
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (IncrementThread thread: threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}

