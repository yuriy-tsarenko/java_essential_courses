package com.java_essential.tsarenko.lesson4.abstraction.ex005_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {
    // ���� �� �� ������������� �����, �� ����� ����������� ����� �� �������� ������.

//    @Override
//    public void simpleMethod() {
//        System.out.println("ConcreteDerivedClass.simpleMethod");
//    }

    // ��������� ����������� ����� abstractMethod() �������� ������������ ������.
    @Override
    public void abstractMethod() {
        System.out.println("ConcreteDerivedClass.abstractMethod();");
    }
}
