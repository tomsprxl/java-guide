package com.liangxu.lambda;

public class Demo01Runnable {
    public static void main(String[] args) {
        // 匿名内部类
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程任务执行！");
            }
        };
        new Thread(task).start(); // 启动线程
    }
}

