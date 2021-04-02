package com.java_essential.tsarenko.lesson2.ex_007_constructors.from_constructors;

public class Animal {
    private int age;
    private int height;

    // аналог перегузки конструкторов путем вызова конструктора  из конструктора
    public Animal() {
        this(13, 69);
    }

//     перегрузить конструктор(метод) с одинаковыми параметрами НЕЛЬЗЯ, даже если это разные переменные по названию
//    public Animal(int age) {
//        this(age, 71);
//    }

    public Animal(int height) {
        this(12, height);
    }



    public Animal(int age, int height) {
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