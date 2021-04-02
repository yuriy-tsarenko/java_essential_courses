package com.java_essential.tsarenko.lesson6.static_members.ex002_static;

/**
 * В статических методах нельзя обращаться к нестатическим полям.
 */
public class Main {
    public static void main(String[] args) {
        NotStaticClass instance = new NotStaticClass(1);

        NotStaticClass.Method();
    }
}
