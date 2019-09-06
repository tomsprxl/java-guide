package com.liangxu.day20190906;

import java.util.ArrayList;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-06 11:28
 */
public class CollectionDemo01 {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        demo3();
        long end = System.currentTimeMillis();

        System.out.println("耗时" + (end - start));

    }


    public static void demo1() {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i+"");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //4494
    }

    public static void demo2() {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i+"");
        }

        for (String s : list) {
            System.out.println(s);
        }
        //3929
    }
    public static void demo3() {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i+"");
        }


        list.forEach(System.out::println);

        //4154
    }
}