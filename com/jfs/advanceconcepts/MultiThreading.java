package com.jfs.advanceconcepts;


class GenerateNumbers extends Thread {
    int i ;
    GenerateNumbers(int i) {
        this.i = i;
    }
    public void run() {
        System.out.println("Inside generatenumbers value is "+i);
    }
}
class RefundAmountThread extends Thread {

    String accountNo;
    String accountName;

    RefundAmountThread(String accountNo, String accountName) {
        this.accountName = accountName;
        this.accountNo = accountNo;
    }

    public void run() {
        System.out.println("Returning the amount for "+accountNo+ " and name : "+ accountName);
        System.out.println("inside run method "+accountName);
    }
}

public class MultiThreading {
    public static void returnAmountToFailedTransactions(String accountNo, String accountName) {
        System.out.println("Returning the amount for "+accountNo+ " and name : "+ accountName);
    }

    public static void main(String []args) {
        String[] failedAccounts = {"Siva", "Kasi", "Akash"} ;
        for(String accountName: failedAccounts) {
//            returnAmountToFailedTransactions("", accountName);
            RefundAmountThread refundAmountThread = new RefundAmountThread("", accountName);
            System.out.println(refundAmountThread.isAlive());
            refundAmountThread.start();
            System.out.println(refundAmountThread.isAlive());
        }

        /*for(int i=1; i<=10;i++) {
            GenerateNumbers thread = new GenerateNumbers(i);
            thread.start();
        }*/
    }
}
