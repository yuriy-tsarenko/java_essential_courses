package com.java_essential.tsarenko.lesson4.abstraction.ex004_abstraction;

public abstract class AbstractBaseClass {
    // 1.
    // ����� ���������� ������������ ������ ��� ��� ������������ �� ����������� ������.
    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    // 2.
    // ����� ���������� ������������ ������ ��� ��� ������������ �� ����������� ������.
    // ���������� � ����������� ������
    public void overriddenMethod() {
        System.out.println("AbstractBaseClass.overriddenMethod");
    }

    // 3.
    // ����������� ����� - ����������� � ����������� ������.
    abstract public void abstractMethod();
}
