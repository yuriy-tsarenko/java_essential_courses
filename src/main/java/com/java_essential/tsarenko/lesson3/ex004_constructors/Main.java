package com.java_essential.tsarenko.lesson3.ex004_constructors;

/**
 * Наследование.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass(1, 2);

        System.out.println(instance.baseNumber);
        System.out.println(instance.derivedField);
    }
}
