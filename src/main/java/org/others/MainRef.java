package org.others;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
@SuppressWarnings("all")

public class MainRef {
    public static void main(String[] args)throws ClassNotFoundException {
        Person person = new Person();
        Class personClass = Person.class;
        Class personClass2 = person.getClass();
        //Class personClass3 = Class.forName("Person");
        Method[] meths = personClass.getMethods();
        for (Method method:meths) {
            System.out.println(method.getName()+","+ Arrays.toString(method.getParameterTypes()));
        }

        Field[] fields = personClass.getDeclaredFields();
        for (Field filed:fields) {
            System.out.println(filed.getName()+","+filed.getType());
        }
        Annotation[] anots = personClass.getAnnotations();
        for (Annotation an:anots) {
            if (an instanceof CustomAnnotation)
            System.out.println("yes");
        }
    }

}
