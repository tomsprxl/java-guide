package com.liangxu.day20190906;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-06 11:14
 */
public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");


        for (String s : list) {
            if (Objects.equals("2",s)){
                list.remove(s);
            }
        }


        list.forEach(System.out::println);

    }
}