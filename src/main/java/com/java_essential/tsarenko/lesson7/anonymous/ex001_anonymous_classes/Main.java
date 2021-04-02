package com.java_essential.tsarenko.lesson7.anonymous.ex001_anonymous_classes;

/**
 * Анонимные классы.
 */
interface Interface1 {
    void method();
    String print();
}

 class Alternative implements Interface1{

     @Override
     public void method() {
     }

     @Override
     public String print() {
         return null;
     }
 }

public class Main {
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Interface1 instance = new Interface1(){

            @Override
            public void method() {
                System.out.println("Hello");
            }

            @Override
            public String print() {
                return "print method!!";
            }
        };

        Interface1 instance2 = new Alternative();
        instance2.print();
        // Вызов метода объекта анонимного класса
        instance.method();
        System.out.println(instance.print());
    }
}
