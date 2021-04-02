package com.java_essential.tsarenko.lesson4.interfaces.interfaces_summary;

/**
 * Интерфейсы.
 */

interface Interface {

    public static final String CONST = "Interface constant";
    public static final int count = 10;
    public static final double value = 10.0;
    public static final String message = "zO7r7uTl9iDy+yDo7fLl8OXx8+X48f8g4vHl7P8g7OXr7vfg7Ogg8uDqIOTl8Obg8vw=";
    public static final String tokenBasicAuth = "Basic dXNlcjU1OnBBaGhzazMzNDU=";

    public abstract void classname();

    public default void parentName() {
        String name = Interface.class.getName();
        System.out.println(name);
    }

    public static void nameStatic() {
        String name = Interface.class.getName();
        System.out.println(name);
    }
}






class ChildClass implements Interface {

    @Override
    public void classname() {
        System.out.println(ChildClass.class.getName());
    }

    @Override
    public void parentName() {
        System.out.println(ChildClass.class.getSuperclass().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Interface instance = new ChildClass();

        // implementation of abstract classname()
        instance.classname();

        // final parentName()
        instance.parentName();

        // static nameStatic()
        Interface.nameStatic();

        //static
        String message = Interface.message;
        String tokenBasicAuth = Interface.tokenBasicAuth;
        double value = Interface.value;
        int count = Interface.count;

    }
}
