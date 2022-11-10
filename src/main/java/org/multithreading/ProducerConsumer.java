package org.multithreading;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("all")
public class ProducerConsumer {
    private Queue<Integer> que = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();
    public void produce(){
        int v=0;
        while (true){
            synchronized (lock){
                while (que.size()==LIMIT){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }que.offer(v++);
                    lock.notify();}
        }
    }
    public void consume(){
        while (true){
            synchronized (lock){
                while (que.size()==0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int v = que.poll();
                System.out.println(v);
                System.out.println("Queue size"+que.size());
                lock.notify();}
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


