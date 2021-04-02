package com.java_essential.tsarenko.lesson6.static_members.ex001_static;

/**
 * Статические члены в нестатических классах.
 */
public class Main {
    public static void main(String[] args) {
        NotStaticClass instance1 = new NotStaticClass(1);
        NotStaticClass instance2 = new NotStaticClass(2);

        instance1.method();
        instance2.method();

        // На классе-объекте NotStaticClass, обращаемся к статическому полю - field
        NotStaticClass.field = 1;
        NotStaticClass.message = "static Message";

        instance1.method();
        instance2.method();
    }
}
