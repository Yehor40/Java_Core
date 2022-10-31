package org.collections;
import java.util.*;
@SuppressWarnings("all")

public class set2 {


    public static void main(String[] args) {
        Map<Person,String>map = new HashMap<>();
        Set<Person>set = new HashSet<>();
        Person pr1 = new Person(1,"loch");
        Person pr2 = new Person(1,"loch");
        map.put(pr1,"111");
        map.put(pr2,"111");
        System.out.println(map);
        set.add(pr1);
        set.add(pr2);
        System.out.println(set);

        Map<String,Integer> mapa = new HashMap<>();
        mapa.put("one",1);
        mapa.put("two",2);
        mapa.put("three",3);
    }
}
