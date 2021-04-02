package com.java_essential.tsarenko.lesson6.nested_classes.ex004_nestedclasses;

/**
 * Вложенные классы.
 */
class MyClass { //
    // Наследование от BaseClass не распространяется.
    public class Nested extends BaseClass {
        public void methodFromNested() {
            System.out.println("Метод Nested класса.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.methodFromBase();
        instance.methodFromNested();
    }
}
