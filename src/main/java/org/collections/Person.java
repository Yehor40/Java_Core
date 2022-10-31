package org.collections;
@SuppressWarnings("all")
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    public Person(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return"Person{"+
                "id:"+id+
                "name:"+name+"}";
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
//{object}->{int}
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    /*Контракт hashCode() equals()
    1)У двух проверяемых объектов вызываем метод hashCode() если хэши разные-Юдва объекта точно разные.
    2)если хэши одинаковые ->equals()
    3)equals()->выдает ответ
    назначение:быстрота и обеспечить мин. количество колизий
   */
    @Override
    public int compareTo(Person o) {
        if (this.name.length()>o.getName().length()){return 1;}
        else if(this.name.length() < o.getName().length()){return -1;}
        else return 0;
    }
}

