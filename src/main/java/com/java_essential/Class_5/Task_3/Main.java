package com.java_essential.Class_5.Task_3;
/*Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1;*/

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(23);
        list.add(0);
        list.add(589);
        list.add(518);
        list.add(58651);
        ListIterator<Integer> iter = list.listIterator();
        int count = 0;

        while (iter.hasNext()) {
            Integer i = iter.next();
            i++;
            list.set(count, i);
            count++;
        }

        System.out.println(list);
    }
}
