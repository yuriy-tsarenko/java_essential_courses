package com.java_essential.kopaiev.essential.homework.lesson5.task3;

import com.java_essential.kopaiev.essential.homework.lesson5.task2.Zoo;

public class Main {
    public static void main(String[] args) {
        /*
        Задание 3
        Используя Intelij IDEA создать проект, пакет. Используя класс Zoo Задания 2,
        удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
        */

        Zoo zoo = new Zoo();
        zoo.fill();

        zoo.animals.remove("Puma");
        zoo.animals.remove("Dog");
        zoo.animals.remove("Hamster");

        System.out.println(zoo.animals.size());
    }
}
