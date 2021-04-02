package com.java_essential.tsarenko.lesson4.interfaces.ex002_interfaces;

/**
 * Множественное наследование.
 */
public class Main {
    public static void main(String[] args) {
        Interface1 instance1 = new DerivedClass();
        Interface2 instance2 = new DerivedClass();

        instance1.method1();
//         instance1.method2();

        instance2.method2();
//         instance2.method1();
    }
}
