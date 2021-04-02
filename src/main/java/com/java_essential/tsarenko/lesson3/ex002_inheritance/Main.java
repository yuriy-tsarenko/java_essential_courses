package com.java_essential.tsarenko.lesson3.ex002_inheritance;

/**
 * Наследование.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        System.out.println(instance.publicField);
        instance.show();
    }
}
