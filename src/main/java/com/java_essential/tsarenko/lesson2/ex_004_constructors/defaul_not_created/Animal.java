package com.java_essential.tsarenko.lesson2.ex_004_constructors.defaul_not_created;

public class Animal {
    private int age;

    // создали конструктор с параметрами
    // конструктор по умолчанию создан не будет, пока Вы это не сделаете руками
    public Animal(int age) {
        this.age = age;
    }
}