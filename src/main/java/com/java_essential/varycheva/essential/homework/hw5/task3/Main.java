package com.java_essential.varycheva.essential.homework.hw5.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random rand = new Random();

        for (int j = 0; j < 10; j++) {
            list.add(rand.nextInt(100));
        }

        list.forEach(System.out::println);

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            list.set(iterator.nextIndex(), iterator.nextIndex() + 1);
            System.out.println(iterator.next());
        }

    }
}
