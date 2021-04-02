package com.java_essential.tsarenko.lesson6.nested_classes.ex001_nestedclasses;

/**
 * Вложенные классы.
 */
class MyClass {
    public class Nested {
        public void method() {
            System.out.println("Метод из Nested класса");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.method();
    }
}
