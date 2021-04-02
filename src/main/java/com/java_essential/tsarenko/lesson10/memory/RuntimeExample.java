package com.java_essential.tsarenko.lesson10.memory;

import java.util.ArrayList;
import java.util.List;

public class RuntimeExample {
    public static void main(String[] args) {
        Reader reader = new Reader();
        List<Integer> arrayList = reader.readFile();
        List<Object> list = new ArrayList<>();
        System.out.println("i \t Free Memory \t Total Memory \t Max Memory");
        for (int i = 0; i < 1000; i++) {
            list.add(arrayList);
            System.out.println(i + " \t " + Runtime.getRuntime().freeMemory() +
                    " \t \t " + Runtime.getRuntime().totalMemory() +
                    " \t \t " + Runtime.getRuntime().maxMemory());
        }
    }
}
