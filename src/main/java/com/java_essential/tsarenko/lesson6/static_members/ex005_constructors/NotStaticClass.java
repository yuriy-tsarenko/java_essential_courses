package com.java_essential.tsarenko.lesson6.static_members.ex005_constructors;

public class NotStaticClass {
    // Контруктор экземпляра, вызывается только при создании экземпляра класса.
    public NotStaticClass() {
        System.out.println("Constructor.");
    }

    // Статический блок вызывается в любом случае,
    // как при обращении к статическому члену, так и при создании экземпляра класса.
    static {
        System.out.println("Static block.");
    }

    // Статический метод.
    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void notStaticMethod() {
        System.out.println("notStaticMethod");
    }
}
