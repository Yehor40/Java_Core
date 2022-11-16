package org.multithreading;

import java.util.Random;
import java.util.concurrent.*;

@SuppressWarnings("all")
public class Main12 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
     /*
        executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("thread started");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("thread finished");
               return 5;
            }
        });*/
        //executorService.shutdown();
        Future<Integer> future = executorService.submit(()->{
            System.out.println("thread started");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread finished");
            Random rnd = new Random();
            int randval = rnd.nextInt();
            if (randval<5)throw new Exception("sth wrong");
            return rnd.nextInt(10);
        });
        executorService.shutdown();
        try {
            int res = future.get();
            System.out.println(res);
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            Throwable ex= e.getCause();
            System.out.println(e.getMessage());}
    }
}
