package com.java_essential.tsarenko.lesson6.static_members.ex004_static_blocks;

/**
 * Статические блоки.
 * Статических блоков может быть сколько угодно и вызываться они будут в том же порядке, в котором написаны.
 */
public class NotStaticClass {
    static int staticField;
    public int second;

    static {
        staticField = 1;
        System.out.println("Static block  X = " + staticField);
    }

    static {
        staticField = 23;
        System.out.println("Static block  X = " + staticField);
    }

    static {
        staticField = -99;
        System.out.println("Static block  X = " + staticField);
    }

    public NotStaticClass(int staticField) {
        NotStaticClass.staticField = staticField;
        this.staticField = 5555;
        System.out.println("Constructor  X = " + NotStaticClass.staticField);
    }
}
