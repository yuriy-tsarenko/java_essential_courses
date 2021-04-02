package com.java_essential.tsarenko.lesson4.interfaces.ex003_interfaces;

/**
 * Множественное наследование от одного класса и нескольких интерфейсов.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();
        instance.method1();
        instance.method2();

        System.out.println("-----------------------------");

        BaseClass instance0 = (BaseClass)instance;
        instance0.method();

        Interface1 instance1 = (Interface1)instance;
        instance1.method1();

        Interface2 instance2 = (Interface2)instance;
        instance2.method2();
    }
}
