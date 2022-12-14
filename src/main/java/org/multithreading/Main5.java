package org.multithreading;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("all")
public class Main5 {
    private Queue que = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();
    public static void main(String[] args) {
        WaitNotify wa = new WaitNotify();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wa.produce();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wa.consume();
            }
        });
        t1.start();
        t2.start();


        try {
            t2.join(); t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
