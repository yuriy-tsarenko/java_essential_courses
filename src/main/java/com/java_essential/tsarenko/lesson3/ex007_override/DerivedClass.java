package com.java_essential.tsarenko.lesson3.ex007_override;

/**
 * Полиморфизм.
 */
public class DerivedClass extends BaseClass {
    // Переопределение метода базового класса.

    @Override
    public void method() {
        System.out.println("method from DerivedClass");
    }
}
