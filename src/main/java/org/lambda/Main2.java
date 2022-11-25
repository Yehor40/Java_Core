package org.lambda;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("all")

public class Main2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer>list1 = new ArrayList<>();
        fillArr(arr1);
        fillList(list1);
        //System.out.println(list1);
       // System.out.println(Arrays.toString(arr1));
        //for (int i = 0; i <10 ; i++) {
          //  arr[i]=arr[i]*3;
            //list.set(i,list.get(i)*3);
        //}
        //map method
        arr1=Arrays.stream(arr1)
                .map(a->a*3)
                .toArray();
        arr1=Arrays.stream(arr1)
                .map(a->3)
                .toArray();
        arr1=Arrays.stream(arr1)
                .map(a->a+1)
                .toArray();
        list1=list1.stream().
                map(a->a*3)
                .collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));
        int[]arr2 = new int[10];
        List<Integer>list2 = new ArrayList<>();
        fillArr(arr2);
        fillList(list2);
        //filter
        arr2=Arrays.stream(arr2).filter(
             a->a%2==0
        ).toArray();
        list2=list2.stream().filter(
                a->a%2==0
        ).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));
        //foreach
        Arrays.stream(arr2).forEach(System.out::println);
        list2.stream().forEach(System.out::println);
        int[]arr3 = new int[10];
        List<Integer>list3 = new ArrayList<>();
        fillList(list3);
        fillArr(arr3);
        //reduce
       int sum1= Arrays.stream(arr3).reduce((acc,k)->acc+k).getAsInt();
       int sum2=list3.stream().reduce((acc,k)->acc*k).get();
        System.out.println(sum1);
        System.out.println(sum2);
        int[] arr4 = new int[10];
        fillArr(arr4);
       int[]New= Arrays.stream(arr4).filter(a->a%2!=0).map(a->a*2).toArray();
        System.out.println(Arrays.toString(New));
        Set<Integer>set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        System.out.println(set);
        set = set.stream().map(a->a*3).collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
    }
    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i]=i+1;
        }
    }
}
