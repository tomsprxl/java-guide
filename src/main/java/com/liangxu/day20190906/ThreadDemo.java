package com.liangxu.day20190906;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-06 16:09
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("ThreadDemo run 方法 运行");
    }


    public static void main(String[] args) {
        new ThreadDemo().start();

    }

}