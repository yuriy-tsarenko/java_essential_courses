package com.java_essential.Cherednichenko.homework.lesson_7;

import com.java_essential.Cherednichenko.classwork.lesson_5.Array;

import java.util.Arrays;

public class Animals {

    public enum Animal {
        ELEPHANT(0, "Слон"),
        MONKEY(0, "Обезьяна"),
        GIRAFFE(0, "Жираф"),
        LION(0, "Лев");

        private int age;
        private final String name;

        @Override
        public String toString() {
            return "Animal{" +
                    "Возраст=" + age +
                    ", Название=" + name +
                    '}';
        }

        Animal(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Animal.ELEPHANT.age = 1;
        Animal.GIRAFFE.age = 2;
        Animal.LION.age = 3;
        Animal.MONKEY.age = 4;
        System.out.println(Arrays.toString(Animal.values()));

    }
}
