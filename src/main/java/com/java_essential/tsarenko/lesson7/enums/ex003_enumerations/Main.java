package com.java_essential.tsarenko.lesson7.enums.ex003_enumerations;

/**
 * Перечисляемые типы (enum).
 * Коструктор и методы.
 */
enum Company {
    // Экземпляры.
    WEBCAMP(1000), GOOGLE(100), SKYNET(10); //, TEST, TEST2(1000, "string"); // - Error
    int value;

    // Конструктор может быть только private.
    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Company myComp = Company.WEBCAMP;
        System.out.println("Я работаю в компании " + myComp + " и зарабатываю " + myComp.getValue() + "$ в месяц.");
    }
}
