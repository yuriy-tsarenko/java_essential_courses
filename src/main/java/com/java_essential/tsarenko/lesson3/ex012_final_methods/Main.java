package com.java_essential.tsarenko.lesson3.ex012_final_methods;

class ClassA {
    public void method1() {
        System.out.println("ClassA.method1");
    }

    public void method2() {
        System.out.println("ClassA.method2");
    }
}

class ClassB extends ClassA {
    @Override
    public final void method1() {
        System.out.println("ClassB.method1");
    }

    @Override
    public void method2() {
        System.out.println("ClassB.method2");
    }
}

class ClassC extends ClassB {
//     Попытка переопределить method1 приводит к ошибке компилятора.
//     @Override
//     public void method1() { System.out.println("ClassC.method1"); }

    // Переопределение method2 позволено.
    @Override
    public final void method2() {
        System.out.println("ClassC.method2");
    }
}

class Main {
    static void main() {
        ClassA instanceA = new ClassA();
        instanceA.method1();
        instanceA.method2();

        System.out.println("-------------------");

        ClassB instanceB = new ClassB();
        instanceB.method1();
        instanceB.method2();

        System.out.println("-------------------");

        ClassC instanceC = new ClassC();
        instanceC.method1();
        instanceC.method2();
    }
}
