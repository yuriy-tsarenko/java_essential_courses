package com.java_essential.tsarenko.lesson2.ex_001_constructors.declaration;

public class Animal {
    private int age;

    // объявление конструктора
    private Animal(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal(5);
        System.out.println(animal.age);
    }
}