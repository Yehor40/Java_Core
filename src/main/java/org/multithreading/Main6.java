package org.multithreading;



@SuppressWarnings("all")

public class Main6 {

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.produce();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consume();
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
