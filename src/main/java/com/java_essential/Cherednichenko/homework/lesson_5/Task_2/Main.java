package com.java_essential.Cherednichenko.homework.lesson_5.Task_2;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(listIterator.next() + 1);
        }
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
