package com.java_essential.tsarenko.lesson1.ex_005_what_is_null;

import com.java_essential.tsarenko.lesson1.ex_004_method_calling.Car;

public class MyClass {
    public static void main(String[] args) {

        String st1 = null;    // можно стрингу присвоить нал
        Car car1 = null;      // можно экземпляру класса присвоить нал
        // int i = null;      // нельзя в примитивный тип впихнуть нал

        String str2 = (String) null; // Нал поддается кастованию в другие типы
        Car car2 = (Car) null;

        System.out.println(null == null);      // true
        System.out.println(car1 == null);      // true
        System.out.println(str2.equals(null));

        car1.getMaxSpeed(); // NullPointerException (RuntimeException)
    }
}
