package org.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@SuppressWarnings("all")
public class Worker {
    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    Object lock1 = new Object();
    Object lock2 = new Object();
    public  void stage1() {
        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(100));
    }}
    public synchronized void stage2(){
        synchronized (lock2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));
        }}
    public void work(){
        for (int i = 0; i <1000 ; i++) {
        stage1();
        stage2();}
    }
    public void main(){
        long before = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
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


        long after = System.currentTimeMillis();
        System.out.println(after-before+"ms");
        System.out.println(list1.size());
        System.out.println(list2.size());
    }

}
