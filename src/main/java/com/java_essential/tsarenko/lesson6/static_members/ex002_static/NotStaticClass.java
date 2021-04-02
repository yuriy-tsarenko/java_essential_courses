package com.java_essential.tsarenko.lesson6.static_members.ex002_static;

public class NotStaticClass {
    static int id;

    // Конструктор.
    public NotStaticClass(int id) {
        this.id = id;
    }

    public static void Method() {
        id = 5;
//        System.out.println("Instance.Id = {0}", );

        System.out.println("В статических методах нельзя обращаться к нестатическим полям.");
    }
}
