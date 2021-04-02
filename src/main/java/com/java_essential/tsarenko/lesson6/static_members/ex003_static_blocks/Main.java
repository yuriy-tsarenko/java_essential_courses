package com.java_essential.tsarenko.lesson6.static_members.ex003_static_blocks;

/**
 * Статические блоки.
 */
public class Main {
    public static void main(String[] args) {
        int value = NotStaticClass.value;
        System.out.println(value);

        NotStaticClass instance = new NotStaticClass();
        System.out.println(instance.value);
    }
}
