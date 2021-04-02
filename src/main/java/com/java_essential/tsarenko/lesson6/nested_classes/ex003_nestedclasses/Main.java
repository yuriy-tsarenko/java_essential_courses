package com.java_essential.tsarenko.lesson6.nested_classes.ex003_nestedclasses;

/**
 * Вложенные классы.
 */
class MyClass {
    private int field = 0;

    public class Nested {
        MyClass instance = new MyClass();

        public void method(int a) {
            instance.field = a;
            field = 10;
            System.out.println(instance.field);
            System.out.println(field);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.method(1);
    }
}
