package org.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("all")
class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1,String o2){
        if (o1.length()>o2.length())
        {return 1;}
        else if(o1.length()<o2.length()){return -1;}
        else{return 0;}
    }

}


public class Komparator {
    public static void main(String[] args) {
        List<String>animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("tiger");
        animals.add("elephant");
        Collections.sort(animals,new StringLengthComparator());
        System.out.println(animals);
        List<Integer>num = new ArrayList<>();
        num.add(1);
        num.add(0);
        num.add(72);
        num.add(50);
        Collections.sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){return -1;}
                else if(o1<o2){return 1;}
                else return 0;
            }
        });
        System.out.println(num);

        List<Person>people = new ArrayList<>();
        people.add(new Person(3,"John"));
        people.add(new Person(1,"Johnny"));
        people.add(new Person(2,"Johnathan"));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId()>o2.getId()) {
                    return 1;
                }else if(o1.getId()<o2.getId()){return -1;}

               else return 0;
            }
        });
        System.out.println(people);
    }
}
