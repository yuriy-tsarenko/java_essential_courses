package com.java_essential.tsarenko.lesson3.ex008_interface_inheritance;

/**
 * Наследование.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass();
        instance.method();
        System.out.println(instance.publicField);

        // UpCast
        SomeInterface value = new SomeClass();
        value.method();
        // System.out.println(instanceUp.publicField); // Error

        // DownCast
        SomeClass instanceDown = (SomeClass) value;
        instanceDown.method();
        System.out.println(instanceDown.publicField);
    }
}
