package com.java_essential.tsarenko.lesson4.interfaces.ex008_interfaces;

/**
 * Наследование от класса и интерфейса у которых совпадают сигнатуры членов.
 */
interface Interface {
    void method();
}

class BaseClass {
    public void method() {
        System.out.println("BaseClass.method()");
    }
}

class DerivedClass extends BaseClass implements Interface {
    // Реализация интерфейса не обязательна, т.к.,
    // сигнатуры методов в классе и интерфейсе совпадают.
}

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        Interface instance1 = (Interface) instance;
        instance1.method();
    }
}
