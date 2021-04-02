package com.java_essential.ZinchenkoVika.varycheva.homework.hw7.task1;

/*
Создайте проект, используя IntelliJ IDEA.
Создайте перечислительный тип (enum) Animals, содержащий конструктор,
который должен принимать целочисленное значение (возраст животного),
и содержать перегруженный метод toString(), который должен возвращать название экземпляра и возраст животного.
 */
public class Main {
    public static void main(String[] args) {
        for (Animals animal : Animals.values()) {
            System.out.println(animal.toString());
        }
    }
}
