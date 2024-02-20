package com.jfs.advanceconcepts.threads;


class GenerateNumbers extends Thread {
    int i ;

    GenerateNumbers(String name){
        super(name);
    }
    GenerateNumbers(int i) {
        this.i = i;
    }
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println("Inside generatenumbers value is "+i);
//            try {
            try {
                Thread.sleep(3000); // 3sec
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

               /* if (!currentThread().getName().equals("generate numbers2")) {
                    this.resume();
                } else {
                    this.suspend();
                }*/
            /*} catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/

        }
    }
}
class RefundAmountThread extends Thread {

    String accountNo;
    String accountName;

    RefundAmountThread(String name) {
        super(name);
    }

    RefundAmountThread(String threadName, String accountNo, String accountName) {
        this(threadName);
        this.accountName = accountName;
        this.accountNo = accountNo;
    }

    public void run() {
        System.out.println("Name of the thread is "+getName());
        System.out.println("Name of the thread is "+Thread.currentThread().getName());
        System.out.println("Returning the amount for "+accountNo+ " and name : "+ accountName);
        System.out.println("inside run method "+accountName);
    }
}

public class MultiThreading {
    public static void returnAmountToFailedTransactions(String accountNo, String accountName) {
        System.out.println("Returning the amount for "+accountNo+ " and name : "+ accountName);
    }

    public static void main(String []args) {
       /* String[] failedAccounts = {"Siva", "Kasi", "Akash"} ;
        for(String accountName: failedAccounts) {

//            returnAmountToFailedTransactions("", accountName);
            RefundAmountThread refundAmountThread = new RefundAmountThread(accountName, "", accountName);
//            Thread thread = new Thread(refundAmountThread);
            System.out.println("Priority of the thread "+ refundAmountThread.getPriority());
            if(accountName.equals("Akash")) {
                refundAmountThread.setPriority(MAX_PRIORITY);
            }

            System.out.println(refundAmountThread.isAlive());
            refundAmountThread.start();
            System.out.println(refundAmountThread.isAlive());
        }*/

        GenerateNumbers thread = new GenerateNumbers("generate numbers");
        thread.start();

        GenerateNumbers thread2 = new GenerateNumbers("generate numbers2");
        thread2.start();
    }
}
