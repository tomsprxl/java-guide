package com.liangxu.day20190906;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-06 11:09
 */
public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if (Objects.equals("2",next)){
                iterator.remove();
            }
        }


        list.forEach(System.out::println);

    }

}