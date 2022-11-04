package org.multithreading;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
//producer-consumer pattern
@SuppressWarnings("all")
public class Main4 {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) {
        Thread tr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });
        Thread tr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer();
            }
        });
        tr1.start();
        tr2.start();
        try {
            tr1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            tr2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void produce()  {
        Random rn = new Random();
        while (true){
            try {
                queue.put(rn.nextInt(100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    private static void consumer() {
        Random rn = new Random();
        while (true){
            try {
                Thread.sleep(100);
                if (rn.nextInt(10)==5){
                System.out.println(queue.take());
                System.out.println("queue size"+queue.size());}
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
