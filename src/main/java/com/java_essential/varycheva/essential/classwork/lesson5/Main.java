package com.java_essential.varycheva.essential.classwork.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        Object[] array2 = list.toArray();
        System.out.println(Arrays.toString(array2));
    }
}
