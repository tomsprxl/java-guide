package com.liangxu.lambda;

public class Demo03ThreadInitParam {
    public static void main(String[] args) {
        Runnable task = new RunnableImpl();
        new Thread(task).start();
    }
}