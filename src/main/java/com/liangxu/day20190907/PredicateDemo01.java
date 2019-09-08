package com.liangxu.day20190907;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo01 {

    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 0;


        System.out.println(predicate.test("嘿嘿"));

        System.out.println(predicate.negate().test("嘿嘿"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();


        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");     // "123"


        Supplier<String> stringSupplier = String::new;
        stringSupplier.get();   // new Person


    }
}
