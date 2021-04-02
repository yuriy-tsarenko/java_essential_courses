package com.java_essential.tsarenko.lesson3.ex009_interface_inheritance;

/**
 * Наследование.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass();
        instance.method1();

        // UpCast
        SomeInterface1 instanceUp1 = instance;
        instanceUp1.method1();
//         instanceUp1.method2(); // Error
//         instanceUp1.method3(); // Error

        // UpCast
        SomeInterface2 instanceUp2 = instance;
        instanceUp2.method2();
        // instanceUp2.method1(); // Error
        // instanceUp2.method3(); // Error

        // UpCast
        SomeInterface3 instanceUp3 = instance;
        instanceUp3.method3();
        // instanceUp3.method1(); // Error
        // instanceUp3.method2(); // Error

        // DownCast
        SomeClass instanceDown = (SomeClass) instanceUp1;
        instanceDown.method1();

        SomeInterface3 value = new SomeClass();
    }
}
