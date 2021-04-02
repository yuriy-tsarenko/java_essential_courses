package com.java_essential.tsarenko.lesson4.interfaces.ex004_interfaces;

/**
 * Наследование интерфейса от интерфейса.
 */
interface Interface1 {
    void method1();
}

interface Interface2 extends Interface1 {
    void method2();
}

interface Interface3 extends Interface2 {
    void method3();
}

interface Interface4 extends Interface3 {
    void method4();
}

class ConcreteClass implements Interface4 {
    @Override
    public void method1() {
        System.out.println("method1 - realizacuya interface Interface1");
    }

    @Override
    public void method2() {
        System.out.println("method2 - realizacuya interface Interface2");
    }

    @Override
    public void method3() {
        System.out.println("method2 - realizacuya interface Interface2");
    }

    @Override
    public void method4() {
        System.out.println("method2 - realizacuya interface Interface2");
    }
}

public class Main {
    public static void main(String[] args) {
//        ConcreteClass instance = new ConcreteClass();
//        instance.method1();
//        instance.method2();
//
//        Interface1 instance1 = (Interface1) instance;
//        instance1.method1();
//
//        Interface2 instance2 = (Interface2) instance;
//        instance2.method1();
//        instance2.method2();

        Interface4 interface4 = new ConcreteClass();
        interface4.method1();
        interface4.method2();
        interface4.method3();
        interface4.method4();
    }
}
