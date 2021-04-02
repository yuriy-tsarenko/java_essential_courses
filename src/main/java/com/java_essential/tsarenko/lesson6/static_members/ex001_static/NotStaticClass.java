package com.java_essential.tsarenko.lesson6.static_members.ex001_static;

public class NotStaticClass {
    private int id;
    public static int field;
    public static String message;

    // Конструктор.
    public NotStaticClass(int id) {
        this.id = id;
    }

    public void method() {
        String text = String.format("id: %s | field: %s | static message: %s", id, field, message);
        System.out.println(text);
    }
}
