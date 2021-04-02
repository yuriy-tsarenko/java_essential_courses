package com.java_essential.tsarenko.lesson6.nested_classes.ex006_nestedclasses;

/**
 * Вложенные классы.
 * Классы могут в себе содержать статические Nested классы.
 */
class MyClass {
    public static class Nested {
        public static void staticMethodFromNested() {
            System.out.println("Статический метод Nested класса.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested.staticMethodFromNested();
    }
}
