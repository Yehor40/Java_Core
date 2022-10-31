package org.collections;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

@SuppressWarnings("all")

public class Kueue {
    final static int SIZE = 3;
    public static void main(String[] args) {
        Person p1 = new Person(1,"k");
        Person p2 = new Person(2,"l");
        Person p3 = new Person(3,"m");
        Person p4 = new Person(4,"n");
        Person p5 = new Person(5,"o");


        Queue<Person> queue = new ArrayBlockingQueue<>(SIZE);
        queue.offer(p3);
        queue.offer(p2);
        queue.offer(p4);
        queue.offer(p1);
        queue.offer(p5);

        System.out.println(
                queue.offer(p3)
        );

    }
}
