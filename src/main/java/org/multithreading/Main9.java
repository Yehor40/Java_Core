package org.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")

public class Main9 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        Connection con = Connection.getConnection();
        for (int i = 0; i < 200; i++) {
            exec.submit(new Runnable() {
                @Override
                public void run() {
                    con.doSemafor();
                }
            });
        }
        exec.shutdown();
        try {
            exec.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
//singleton
class Connection{
    private static Connection cn = new Connection();
    private Semaphore smf = new Semaphore(10);
    private int conCount = 0;
    private Connection(){

    }
    public static Connection getConnection(){
        return cn;
    }
    public void doSemafor(){
        try {
            smf.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
             doWork();
        }finally {
            smf.release();
        }
    }
    private void doWork(){
        synchronized (this){
            conCount++;
            System.out.println(conCount);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (this){
            conCount--;
        }
    }
}