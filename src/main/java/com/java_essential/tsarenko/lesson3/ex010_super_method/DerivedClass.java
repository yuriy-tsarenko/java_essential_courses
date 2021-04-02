package com.java_essential.tsarenko.lesson3.ex010_super_method;

public class DerivedClass extends BaseClass {
    // Переопределение метода базового класса.

    @Override
    public void method() {
        // Вызов метода базового класса.
        super.method();

        System.out.println("method from DerivedClass");
    }
}