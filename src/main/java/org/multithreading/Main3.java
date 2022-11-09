package org.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
@SuppressWarnings("all")
public class Main3 {
    public static void main(String[] args)throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executor.submit(new Work(i));}
            executor.shutdown();
            System.out.println("all tasks completed");

                executor.awaitTermination(1, TimeUnit.DAYS);


    }
}
