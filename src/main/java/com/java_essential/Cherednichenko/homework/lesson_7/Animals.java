package com.java_essential.Cherednichenko.homework.lesson_7;

import com.java_essential.Cherednichenko.classwork.lesson_5.Array;

import java.util.Arrays;

public class Animals {

    public enum Animal {
        ELEPHANT(0),
        MONKEY(0),
        GIRAFFE(0),
        LION(0);

        private int age;

        Animal(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "" + name() + "{" +
                    "age=" + age +
                    '}';
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
