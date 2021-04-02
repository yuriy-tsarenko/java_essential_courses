package com.java_essential.tsarenko.lesson4.interfaces.ex005_interfaces;

/**
 * Наследование от интерфейсов у которых совпадают имена членов.
 * <p>
 * Объединение реализации одноименных абстрактных членов.
 */
interface Interface1 {
    void someTask();
}

interface Interface2 extends Interface1 {
    void someTask();
}

class ConcreteClass implements Interface2 {
    public void someTask() {
        System.out.println("method -  realizacuya interface Interface (1-2)");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.someTask();

        Interface1 instance1 = instance;
        instance1.someTask();

        Interface2 instance2 = instance;
        instance2.someTask();
    }
}
