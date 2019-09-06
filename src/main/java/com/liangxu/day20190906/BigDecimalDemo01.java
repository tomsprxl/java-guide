package com.liangxu.day20190906;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-06 10:40
 */
public class BigDecimalDemo01 {
    public static void main(String[] args) {
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        System.out.println(a);// 0.100000024
        System.out.println(b);// 0.099999964
        System.out.println(a == b);// false
    }

}