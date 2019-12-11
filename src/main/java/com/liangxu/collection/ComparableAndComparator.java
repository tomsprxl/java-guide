package com.liangxu.collection;

import java.util.*;

public class ComparableAndComparator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println("原始数组: ");
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println("Collections.reverse(arrayList): ");
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println("Collections.sort(arrayList): ");
        System.out.println(arrayList);


        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("定制排序后: ");
        System.out.println(arrayList);


        TreeMap<Person, String> treeMap = new TreeMap<>();
        treeMap.put(new Person(5, "zhangSan"), "张三");
        treeMap.put(new Person(-5, "lisi"), "李四");
        treeMap.put(new Person(9, "wangwu"), "张三");
        treeMap.put(new Person(66, "zhaoliu"), "赵六");
        treeMap.put(new Person(2, "xuba"), "徐把");

        Set<Person> people = treeMap.keySet();

        for (Person person : people) {
            System.out.println("person = " + person.toString());
        }


    }
}
