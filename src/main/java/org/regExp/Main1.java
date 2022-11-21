package org.regExp;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String s = "hello111java222world";
        String[] words = s.split("\\d*");
        System.out.println(Arrays.toString(words));
        String b = "Hello world world";
        String q = b.replaceAll(" ",".");
        System.out.println(q);
        String h = s.replaceFirst("\\d+","-");
        System.out.println(h);
    }
}
