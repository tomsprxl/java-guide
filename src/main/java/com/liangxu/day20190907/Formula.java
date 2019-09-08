package com.liangxu.day20190907;

interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    static void main(String[] args) {
        Formula formula =new Formula() {
            @Override
            public double calculate(int a) {
                return 0;
            }
        };
        System.out.println(formula.sqrt(16));
    }


}