package com.java_essential.kopaiev.essential.homework.lesson5.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    /*
    Задание 4
Используя Intelij IDEA создать проект, пакет. Создать класс Main, создать список целых чисел
и используя ListIterator пройтись по списку и увеличить значения на 1;
    */

    public static void main(String[] args) {
        List <Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }

        // Print source Array
        System.out.println("Old Array");
        System.out.println(arrayList + "\n");

        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            int element = listIterator.next();
            listIterator.set(element + 1);
        }

        // Print changed Array
        System.out.println("New Array");
        System.out.println(arrayList);
    }
}
