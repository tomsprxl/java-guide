package com.liangxu.lambda;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("多线程任务执行！");
    }
}