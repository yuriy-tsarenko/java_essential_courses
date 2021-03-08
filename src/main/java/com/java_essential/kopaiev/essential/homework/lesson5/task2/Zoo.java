package com.java_essential.kopaiev.essential.homework.lesson5.task2;

import java.util.ArrayList;

public class Zoo {

    /*
 Задание 2
 Используя Intelij IDEA создать проект, пакет. Создать класс Zoo. В классе создать список, в который записать
 8 животных через метод add(index, element). Вывести список в консоль.
    */

    public ArrayList<String> animals = new ArrayList<>();

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fill();
        zoo.show();
    }

    public void fill() {
        animals.add(0, "Giraffe");
        animals.add(1, "Elephant");
        animals.add(2, "Puma");
        animals.add(3, "Cat");
        animals.add(4, "Dog");
        animals.add(5, "Perot");
        animals.add(6, "Hamster");
        animals.add(7, "Fish");
    }

    private void show() {
        for (String animal : animals) System.out.println(animal);
    }
}
