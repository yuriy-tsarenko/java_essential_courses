package com.java_essential.tsarenko.lesson7.anonymous.ex002_anonymous_classes;

import java.util.List;

/**
 * Анонимные классы.
 */
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Interface instance = new Interface() {
            public double d = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method() {
                num = 1234;
                System.out.println("instance1: d = " + d + ", str = " + str + ", num = " + num);
            }

        };

        Interface instance2 = new Interface() {
            public double d = 1.32;
            protected String str = "Anonymous class2";
            private int num = 22;

            @Override
            public void method() {
                num = 1234;
                System.out.println("instance1: d = " + d + ", str = " + str + ", num = " + num);
            }

        };
        List<Interface> list = List.of(instance, instance2);
        list.forEach(inst -> inst.method());
//        instance.method();
        // Поле не доступно
        //System.out.println(instance.d);
    }
}
