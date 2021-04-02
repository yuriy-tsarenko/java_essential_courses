package com.java_essential.tsarenko.lesson3.ex005_inheritance;

/**
 * Приведение к базовому типу.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;

        instance.field4 = 4;
        instance.field5 = 5;

        // Приведение экземпляра класса DerivedClass к базовому типу BaseClass.
        BaseClass newInstance = (BaseClass) instance; //Upncast

        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);

//        System.out.println(newInstance.field4);
//        System.out.println(newInstance.field5);

        // Проверка.
        System.out.println("instance Id:     " + instance.hashCode());
        System.out.println("newInstance Id:  " + newInstance.hashCode());
    }
}
