package com.java_essential.tsarenko.lesson6.static_members.ex003_static_blocks;

/**
 * Статические блоки.
 * Статический блок вызывается, когда класс подгружается в память.
 */
public class NotStaticClass {
    public int nonStaticValue;
    public static final int value;

    {
        nonStaticValue = 10;
    }

    // Статический блок.
    static {
        value = 10;
        System.out.println("Static block static value = " + value);
    }

    public NotStaticClass() {
        // X = 4; // Ошибка, так как статический блок вызывается раньше, чем конструктор.
        System.out.println("Constructor  static value = " + value);
        System.out.println("non static field" + nonStaticValue);
    }
}
