package com.java_essential.tsarenko.lesson3.ex004_constructors;

/**
 * Наследование.
 */
public class BaseClass {
    public int baseNumber;

    // Конструктор по умолчанию.
    public BaseClass() {
    }

    // Пользовательский конструктор.
    public BaseClass(int number) {
        this.baseNumber = number;
    }
}
