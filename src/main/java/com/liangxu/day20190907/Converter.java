package com.liangxu.day20190907;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);

    static void main(String[] args) {
        Converter<String, Integer> converter = Integer::valueOf;
        Something something = new Something();

        Converter<String, String> converter1 = something::startsWith;


        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);


        stringConverter.convert(2);


    }


    class Something {
        String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }
    }
}