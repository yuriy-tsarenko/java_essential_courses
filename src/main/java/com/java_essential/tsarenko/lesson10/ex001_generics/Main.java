package com.java_essential.tsarenko.lesson10.ex001_generics;

/**
 * Универсальные шаблоны.
 * На 8-й строке создаем класс с именем MyClass, параметризированный указателем места заполнения типом - T
 */
class MyClass<T, R> {
    public T field;
    public R fieldTwo;

    public void method() {
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса MyClass и в качестве параметра типа (тип MyClass) передаем тип String.
        MyClass<String, String> instance1 = new MyClass<>();
        instance1.field = "ABC";
        instance1.method();

        //// В качестве параметра типа передавать примитивные типы (int, long, float, double, и так далее) нельзя.
        //MyClass<int> instance2 = new MyClass<int>();
        //instance2.method();

        // Создаем экземпляр класса MyClass и в качестве параметра типа (тип MyClass) передаем тип Integer.
        MyClass<Integer, String> instance2 = new MyClass<Integer, String>();
        instance2.field = 1234;
        instance2.method();
    }
}
