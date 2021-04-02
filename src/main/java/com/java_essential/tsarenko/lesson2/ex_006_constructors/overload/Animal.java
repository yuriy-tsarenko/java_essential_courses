package com.java_essential.tsarenko.lesson2.ex_006_constructors.overload;

public class Animal {
    private int age;
    private int height;

    // перегруженые конструкторы
    public Animal() {
        // задаем начальные параметры полей. Обычно в таких ситуациях параметры задаются по умолчанию
        this.age = 14;
        this.height = 60;
    }

    public Animal(int age) {
        // задаем один начальный параметр, второй указываем при создании объекта
        this.age = age;
        this.height = 66;
    }

    public Animal(int age, int height) {
        // оба параметра задаем при создании объекта
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}