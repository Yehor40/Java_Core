package org.multithreading;

import java.util.Random;

@SuppressWarnings("all")
public class Main11 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random rn = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    if (  Thread.currentThread().isInterrupted()){
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    Math.sin(rn.nextDouble());

                }
            }
        });
        System.out.println("Thread t1 started");
        t1.start();
        t1.interrupt();
        try {
            Thread.sleep(1000);
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread t1 finished");
    }
}
