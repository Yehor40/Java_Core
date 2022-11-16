package org.multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings("all")

public class Main10 {

    public static void main(String[] args) {
        Runer rnr = new Runer();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rnr.trd1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                rnr.trd2();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        rnr.finished();
    }
}
class Runer  {
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    private Account a1 = new Account();
    private Account a2 = new Account();
    private void getLocks(Lock lock1,Lock lock2){
        boolean flocktaken = false;
        boolean slocktaken = false;
        while(true){
            try{
            flocktaken=lock1.tryLock();
            slocktaken=lock2.tryLock();}finally{
                if (flocktaken&&slocktaken) {
                    return;
                }else if (flocktaken){lock1.unlock();
                } else if (slocktaken) {
                    lock2.unlock();
                }

            }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }
    public void trd1(){
        Random rn = new Random();
        for (int i = 0; i <10000 ; i++) {
            getLocks(lock1,lock2);
            try{
            Account.transfer(a1,a2, rn.nextInt(100));}finally{
            lock1.unlock();
            lock2.unlock();}
        }
    }
    public void trd2(){
        Random rn = new Random();
        for (int i = 0; i <10000 ; i++) {
            getLocks(lock2,lock1);
            try{
                Account.transfer(a2,a1, rn.nextInt(100));}finally{
                lock1.unlock();
                lock2.unlock();}
            /*
            /during the execution of this code occurs DEADLOCK/
            Random rn = new Random();
        for (int i = 0; i <10000 ; i++) {
            lock2.lock();
            lock1.lock();
            try{
                Account.transfer(a2,a1, rn.nextInt(100));}finally{
                lock1.unlock();
                lock2.unlock();}
             */
        }
    }
    public void finished(){
        System.out.println("first acc: "+a1.getBalance());
        System.out.println("second acc: "+a2.getBalance());
        System.out.println("total balance: "+(a1.getBalance()+a2.getBalance()));
    }
}
class Account {
    private int balance = 10000;
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    public int getBalance(){
        return balance;
    }
    public static void transfer(Account a1,Account a2,int amount){
        a1.withdraw(amount);
        a2.deposit(amount);
    }
}