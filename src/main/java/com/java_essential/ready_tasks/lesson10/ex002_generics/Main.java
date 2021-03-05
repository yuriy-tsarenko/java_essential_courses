package com.java_essential.ready_tasks.lesson10.ex002_generics;

/**
 * Универсальные шаблоны.
 */
class MyGenerics<S, J> {
    // Поля
    public S variable1;
    public J variable2;

    // Конструктор.
    public MyGenerics(S argument1, J argument2) {
        this.variable1 = argument1;
        this.variable2 = argument2;
    }
}

class Custom<TYPE1, TYPE2> {
    public TYPE1 field;
    public TYPE2 value;

}

class Container {
    public String data;

    public Container(String data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        MyGenerics<Integer, Integer> instance1 = new MyGenerics<>(1, 2);
        System.out.println(instance1.variable1 + instance1.variable2);

        MyGenerics<String, Integer> instance2 = new MyGenerics<>("Number ", 1);
        System.out.println(instance2.variable1 + instance2.variable2);

        MyGenerics<String, String> instance3 = new MyGenerics<>("Hello ", "World");
        System.out.println(instance3.variable1 + instance3.variable2);

        MyGenerics<String, Container> instance4 = new MyGenerics<>("word", new Container("info"));
        System.out.println(instance4.variable1 + instance4.variable2.data);
    }
}
