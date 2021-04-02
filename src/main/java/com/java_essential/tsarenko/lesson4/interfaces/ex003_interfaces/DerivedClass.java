package com.java_essential.tsarenko.lesson4.interfaces.ex003_interfaces;

public class DerivedClass extends BaseClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Realizacuya methoda method1() iz Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Realizacuya methoda method2() iz Interface2");
    }

    @Override
    public void method() {
        System.out.println("Realizacuya methoda method2() iz BaseClass");
    }
}
