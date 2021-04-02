package com.java_essential.tsarenko.lesson2.ex_005_constructors.private_constructor;

public class Animal {
    private int age;

    public Animal() {
    }

    // объявленный конструктор является приватным. Может быть использован только в рамках данного класса
    public Animal(int age) {
        this.age = age;
    }
}