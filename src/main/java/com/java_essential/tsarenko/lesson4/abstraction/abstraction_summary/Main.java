package com.java_essential.tsarenko.lesson4.abstraction.abstraction_summary;

/**
 * Абстрактный класс.
 */
abstract class AbstractClass {

    static final String CONST = "AbstractClass constant";
    private int count = 10;
    protected double value = 10.0;
    public String message = "zO7r7uTl9iDy+yDo7fLl8OXx8+X48f8g4vHl7P8g7OXr7vfg7Ogg8uDqIOTl8Obg8vw=";
    String tokenBasicAuth = "Basic dXNlcjU1OnBBaGhzazMzNDU=";

    protected abstract void classname();

    public void print() {
        System.out.println("Hi");
    }

    public final void parentName() {
        String name = AbstractClass.class.getName();
        System.out.println(name);
    }

    public static void nameStatic() {
        String name = AbstractClass.class.getName();
        System.out.println(name);
    }
}





/**
 * Конкретный класс.
 */
class ChildClass extends AbstractClass {

    @Override
    public void classname() {
        String name = ChildClass.class.getName();
        System.out.println(name);
    }

    @Override
    public void print() {
        System.out.println("Implementation");
    }
}


public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ChildClass();
        // Override print()
        instance.print();

        // implementation of abstract classname()
        instance.classname();

        AbstractClass.nameStatic();
        // final parentName()
        instance.parentName();
        // static nameStatic()

    }
}
