package com.liangxu.day20190907;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        names.sort(String::compareTo);

    }
}
