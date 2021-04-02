package com.java_essential.tsarenko.lesson4.abstraction.ex004_abstraction;

public class Main {
    public static void main(String[] args) {
        ConcreteDerivedClass instance = new ConcreteDerivedClass();

        instance.simpleMethod();
        instance.overriddenMethod();
        instance.abstractMethod();
    }
}
