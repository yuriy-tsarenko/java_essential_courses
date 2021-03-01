package com.java_essential.Cherednichenko.classwork.lesson_5;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        Integer[] arrayInt = new Integer[]{1, 2, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listInt;
        listInt = Arrays.asList(arrayInt);
        for (Integer integer : listInt) {
            System.out.println(integer);
        }
        Object[] arrayIntnew = listInt.toArray();
        for (Object integer : arrayIntnew) {
            System.out.println(integer);
        }
    }
}
