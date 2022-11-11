package org.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SuppressWarnings("all")

public class Main7 {
    public static void main(String[] args)throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(3);
        ExecutorService ec = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            ec.submit(new Processor(i,cdl));
        }ec.shutdown();
        for (int i = 0; i <3 ; i++) {
            Thread.sleep(1500);
            cdl.countDown();
        }
    }
}
class Processor implements Runnable{
  private final CountDownLatch cdl;
  private final int id;
    public Processor(int id,CountDownLatch cdl) {
        this.cdl = cdl;
        this.id = id;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            cdl.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread with id"+id+" proceeded");
    }
}