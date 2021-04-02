package com.java_essential.tsarenko.lesson5.ex_006_arrays.array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(100);

        arrayList.add("name");
        arrayList.add("surname");

        // задаем вместимость листа

        // размер листа на текущее время
        System.out.println(arrayList.size());

        // достаем элемент по индексу
        System.out.println(arrayList.get(1));

        // Ошибка IndexOutOfBoundException
        // System.out.println(arrayList.get(2));

        // достаем индекс объекта
        System.out.println(arrayList.indexOf("name"));

        //достаем индекс объекта с конца
        System.out.println(arrayList.lastIndexOf("surname"));
    }
}
