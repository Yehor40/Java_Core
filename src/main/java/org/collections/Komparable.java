package org.collections;
import java.util.*;
@SuppressWarnings("all")
public class Komparable {
    public static void main(String[] args) {
        List<Person>people = new ArrayList<>();
        Set<Person>peoplesset = new TreeSet<>();
        addElements(people);
        addElements(peoplesset);
        Collections.sort(people);
        System.out.println(people);

        System.out.println(peoplesset);
    }
    private static void addElements(Collection collection){
        collection.add(new Person(1,"John"));
        collection.add(new Person(3,"Johnny"));
        collection.add(new Person(2,"Johnathan"));
        collection.add(new Person(4,"Jan"));
    }
}
