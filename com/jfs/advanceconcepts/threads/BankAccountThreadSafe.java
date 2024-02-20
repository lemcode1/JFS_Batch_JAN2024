package com.jfs.advanceconcepts.threads;


class Account {
    int balance;

    public synchronized void deposit(int depositAmount) {
        balance += depositAmount;
    }

    public void withdraw(int withDrawAmount) {
        balance -= withDrawAmount;
    }
}

/*
class Person extends Thread {
    String name;

    Account account;

    public Person(String name, Account account) {
        super();
        this.name = name;
        this.account = account;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "current balance is : "+ account.balance);
        for(int i=0; i<10 ;i++) {
            account.deposit(500);
        }
        System.out.println(Thread.currentThread().getName() + " after deposit balnce is : "+ account.balance);
    }
}
*/


public class BankAccountThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
//        Thread t1 = new Thread(new Person("kasi", account), "Kasi");
//        Thread t2 = new Thread(new Person("Mohan", account), "Mohan");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "current balance is : "+ account.balance);
                for(int i=0; i<1000 ;i++) {
                    account.deposit(500);
                }
                System.out.println(Thread.currentThread().getName() + " after deposit balnce is : "+ account.balance);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "current balance is : "+ account.balance);
                for(int i=0; i<1000 ;i++) {
                    account.deposit(500);
                }
                System.out.println(Thread.currentThread().getName() + " after deposit balnce is : "+ account.balance);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final balance is :"+account.balance);
    }
}
//Mohancurrent balance is : 1000
//Kasicurrent balance is : 1000
//Mohan after deposit balnce is : 1500
//Kasi after deposit balnce is : 2000