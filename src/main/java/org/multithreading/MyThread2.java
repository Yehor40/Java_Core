package org.multithreading;

class MyThread2 extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        super.run();
        while (running) {
            System.out.println("hello");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shut() {
        this.running = false;
    }
}
