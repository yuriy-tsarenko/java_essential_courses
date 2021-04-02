package com.java_essential.tsarenko.lesson10.ex003_generics;

/**
 * Универсальные шаблоны. (Универсальный метод)
 */
class MyClass {

    public static <T> T getType(T argument) {
        return argument;
    }

    public static Object getResult(Object argument) {
        return argument;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance = new MyClass();
        String name = "name";

        String result = (String) MyClass.getResult(name);
        String type = MyClass.getType(name);
        System.out.println(result);
        System.out.println(type);
    }
}
