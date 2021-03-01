package com.java_essential.varycheva.essential.homework.hw5.task2;

import com.java_essential.varycheva.essential.homework.hw5.task1.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(10);
        System.out.println(zoo.getSize());
        zoo.deletedAnimal(3);
        zoo.deletedAnimal(5);
        zoo.deletedAnimal(7);
        System.out.println(zoo.getSize());
    }
}
