package org.collections;
import java.util.*;
@SuppressWarnings("all")

public class Iterable {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //before java 5
        Iterator<Integer>iterator = list.iterator();
        int idx = 0;
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            if (idx==1)
            iterator.remove();

        idx++;}
        System.out.println(list);

        System.out.println("\n");

        //java 5
        for (int x:list) {

            System.out.println(x);}
    }
}






