package com.java_essential.tsarenko.lesson6.static_members.ex007_static;

/**
 * ����������� ����� �� ����� ���� ����������������� � ������������.
 * <p>
 * ����������� ����� ������������ ���������.
 */
abstract class BaseClass {
    //public abstract static void abstractStaticMethod(); // Error

    public static void firstMethod() {
        System.out.println("BaseClass.staticMethod");
    }
}

class DerivedClass extends BaseClass {

    public static void firstMethod() {
        System.out.println("DerivedClass.staticMethod");
    }

    public static void secondMethod(String string) {
        System.out.println("DerivedClass.staticMethod " + string);
    }
}

public class Main {
    public static void main(String[] args) {
        BaseClass.firstMethod();
        DerivedClass.secondMethod("Hello");
        DerivedClass.firstMethod();
        BaseClass instance = new DerivedClass();
    }
}
