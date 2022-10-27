package org.collections;

import java.util.*;
@SuppressWarnings("all")

//set stores unique objects
public class set {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();//no order
        Set<String> LinkedhashSet = new LinkedHashSet<>();//same order when it was put in
        Set<String> treeSet = new TreeSet<>();//sorted order
        hashSet.add("Dmytro");
        hashSet.add("Ivan");
        hashSet.add("Iskander");
        hashSet.add("Iosif");
        hashSet.add("Iosif");

        Set<Integer> Set1 = new HashSet<>();

        Set1.add(1);
        Set1.add(2);
        Set1.add(3);
        Set1.add(4);
        Set1.add(5);

        Set<Integer> Set2 = new HashSet<>();
        Set2.add(3);
        Set2.add(4);
        Set2.add(5);
        Set2.add(6);
        Set2.add(7);
        Set<Integer> union = new HashSet<>(Set1);//no order
        //union - union of set
        union.addAll(Set2);
        System.out.println(union);

        //intersection - intersection of sets
        Set<Integer> intersection = new HashSet<>(Set1);//
        intersection.retainAll(Set2);
        System.out.println(intersection);

        //difference - difference of sets
        Set<Integer> difference = new HashSet<>(Set1);//
        difference.removeAll(Set2);
        System.out.println(difference);
    }
}
