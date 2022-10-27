package org.collections;
import java.util.*;
@SuppressWarnings("all")
class Person{
    private int id;
    private String name;
    public Person(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return"Person{"+
                "id:"+id+
                "name:"+name+"\'"+"}";
    }


    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
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
    }
}
