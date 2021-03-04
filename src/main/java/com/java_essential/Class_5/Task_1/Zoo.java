package com.java_essential.Class_5.Task_1;
/* Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element). Вывести список в консоль.*/

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add(0, "Cat");
        animals.add(1, "Dog");
        animals.add(2, "Swallow");
        animals.add(3, "Penguin");
        animals.add(4, "Pig");
        animals.add(5, "Fox");
        animals.add(6, "Pigeon");
        animals.add(7, "Tiger");

        System.out.println(animals);
    }

}
