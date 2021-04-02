package com.java_essential.tsarenko.lesson3.ex003_constructors;

/**
 * Наследование.
 */
public class BaseClass {
    public int baseNumber;

    // Конструктор по умолчанию.
    public BaseClass() {
    }

    // Пользовательский конструктор.
    public BaseClass(int baseNumber) {
        this.baseNumber = baseNumber;
    }
}
