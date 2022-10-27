package org.collections;
import java.util.*;
//Map stores key->value
@SuppressWarnings("all")

public class Main {

    public static void main(String[] args) {
        //hashmap implementation
       Map<Integer,String>map = new HashMap<>();

       map.put(1,"Hello");
       map.put(2,"My");
       map.put(3,"World");
      /*
       System.out.println(map);
       map.put(1,"World");
       System.out.println(map);

       System.out.println(map.get(2));
        System.out.println(map.get(4));
       */
       /*
        for (Map.Entry<Integer,String> entry:map.entrySet()) {
        System.out.println(entry.getKey()+"-"+entry.getValue());}
        */


        //natural ordering
        Map <Integer,String> hashMap = new HashMap<>();//pair order is not defined
        Map <Integer,String> linkedhashMap = new LinkedHashMap<>();//pair order is defined(the order they were added in is the order they will return)
        Map <Integer,String> treeMap = new TreeMap<>();//pair is sorted by key
        System.out.println("HashMap order:");
        testMap(hashMap);
        System.out.println("LinkedHashMap order:");
        testMap(linkedhashMap);
        System.out.println("TreeMap order order:");
        testMap(treeMap);
    }

    public static void testMap(Map<Integer,String>map){
        map.put(3,"dick");
        map.put(8,"dic");
        map.put(6,"di");
        map.put(1,"d");
        for (Map.Entry<Integer,String>entry: map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}