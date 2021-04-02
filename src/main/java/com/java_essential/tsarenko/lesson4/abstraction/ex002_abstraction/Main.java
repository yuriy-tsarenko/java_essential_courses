package com.java_essential.tsarenko.lesson4.abstraction.ex002_abstraction;

/**
 * ���������� ����� A.
 */
class ConcreteClassA {
    public void operation() {
        System.out.println("ConcreteClassA.operation");
    }
}

/**
 * ����������� �����.
 */
abstract class AbstractClass extends ConcreteClassA {
    public abstract void method();
}

/**
 * ���������� ����� B.
 */
abstract class ConcreteClassB extends AbstractClass {
    public abstract void print();
}


 class ConcreteClassC extends ConcreteClassB {

     @Override
     public void method() {
         System.out.println("method");
     }

     @Override
     public void print() {
         System.out.println("print");
     }
 }

public class Main {
    public static void main(String[] args) {
        ConcreteClassB instance = new ConcreteClassC();

        instance.method();
        instance.operation();
        instance.print();
    }
}
