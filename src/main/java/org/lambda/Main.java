package org.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
@SuppressWarnings("all")

public class Main {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("hello,");
        list.add("it's");
        list.add("me");
      /*
       list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){return 1;}
                else if(o1.length()<o2.length()){
                return -1;}
           else return 0; }
        });
       */
        Comparator<String>cm = (s1,s2)->{
            if (s1.length()>s2.length())return 1;
            else if(s1.length()<s2.length())return -1;
            else return 0;
        };
       list.sort(cm);
        System.out.println(list);

      /*
       Runer rn = new Runer();
       int a=4;
       //rn.run(new ExecutableImpl());
       rn.run(new ExecutableImpl(){

           @Override
           public int execute(int x,int y) {
               int a=7;
               return y*x+1;
           }
       });

       rn.run((x,y)->y*x+1);
        rn.run((x,y)->{
            int b=2;
            return x+y*a/b;
        });
       */
        //Thread t = new Thread(()->{});
    }
}
