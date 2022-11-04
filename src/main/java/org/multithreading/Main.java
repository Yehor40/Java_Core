package org.multithreading;

import java.util.Scanner;

//потоки не синхронизированы,они могут выполняться в любом порядке
//борятся за процессорное время
@SuppressWarnings("all")

public class Main {
    public static void main(String[] args)throws InterruptedException {
//        MyThread tread = new MyThread();
//        tread.start();
//        MyThread tread1 = new MyThread();
//        tread1.start();
//        Thread tread2 = new Thread(new Runner());
//        tread2.start();
        MyThread2 tread = new MyThread2();
        tread.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        tread.shut();
    }}

