package org.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
@SuppressWarnings("all")
public class Main8 {
    public static void main(String[] args) {
        Task task = new Task();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.fthread();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.sthread();
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
        task.showCounter();
    }
}
class Task{
    private final Lock lock = new ReentrantLock();
    private int  counter;
    private void increment(){
        for (int i = 0; i <10000; i++) {
            counter++;
        }
    }
    public void fthread(){
        lock.lock();
        increment();
        lock.unlock();
    }
    public void sthread(){
        lock.lock();
        increment();
        lock.unlock();
    }
    public void showCounter(){
        System.out.println(counter);
    }
}