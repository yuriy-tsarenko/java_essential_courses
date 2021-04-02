package com.java_essential.tsarenko.lesson7.anonymous.ex005_anonymous_classes;

/**
 * Анонимные классы.
 */
interface Interface {
    void method();

    int getValue();
}

public class Main {
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Interface instance1 = new Interface() {
            int field = 0;

            @Override
            public void method() {
                field = 100;
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        // Объявление анонимного (внутреннего) класса
        Interface instance2 = new Interface() {
            int field = -1;

            @Override
            public void method() {
                field = instance1.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        instance2.method();
        instance1.method();

        System.out.println("instance1: field = " + instance1.getValue() + "    instance2: field = " + instance2.getValue());
    }
}

