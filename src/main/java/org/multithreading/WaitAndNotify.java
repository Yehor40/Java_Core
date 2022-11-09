package org.multithreading;

import java.util.Scanner;

@SuppressWarnings("all")
public class WaitAndNotify {
    public void produce(){
        synchronized (this){
            System.out.println("producer thread started");
            try {
                this.wait();//1-intrinsic lock;2-ждем пока будет вызван notify
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("producer thread resumed...");
        }
    }
    public void consume(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        synchronized (this){
            System.out.println("waiting for return key pressed");
            sc.nextLine();
            this.notify();

        }
    }
}
