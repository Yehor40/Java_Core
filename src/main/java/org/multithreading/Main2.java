package org.multithreading;
@SuppressWarnings("all")
public class Main2 {
    private int counter;
    public static void main(String[] args)throws InterruptedException {
        Main2 main2 = new Main2();
        main2.doWork();
    }
    public synchronized void increment(){counter++;}
    public void doWork()throws InterruptedException{
        Thread tread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        Thread tread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        tread1.start();
        tread2.start();
        tread1.join();
        tread2.join();
        System.out.println(counter);
    }
}
