package com.java_essential.tsarenko.lesson4.abstraction.ex006_abstraction;

abstract class AbstractClass {
    // Конструктор (отрабатывает первым).
    public AbstractClass() {
        System.out.println("1 AbstractClass()");

        // Вызывается реализация метода из производного класса - ConcreteClass.
        this.abstractMethod();

        System.out.println("2 AbstractClass()");
    }

    public abstract void abstractMethod();

    public abstract void print();
}

class ConcreteClass extends AbstractClass {
    String s = "FIRST";

    // Конструктор (отрабатывает вторым).
    public ConcreteClass() {
        System.out.println("3 ConcreteClass()");
        s = "SECOND";
    }

    @Override
    public void abstractMethod() {
        System.out.println("method realisation abstractMethod() in ConcreteClass  " + s);
    }

    @Override
    public void print() {

    }
}
public class Main {
    public static void main(String[] args) {

        AbstractClass instance = new ConcreteClass();

        System.out.println("-------------------------------");

        instance.abstractMethod();



        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void abstractMethod() {
                System.out.println("independent realisation");
            }

            @Override
            public void print(){
                System.out.println("print");
            }
        };
        System.out.println();
        abstractClass.abstractMethod();
        abstractClass.print();
    }
}
