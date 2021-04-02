package com.java_essential.tsarenko.lesson1.ex_002_access_modifiers;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();

        shape.square = 24.0; // доступ к public полю
        System.out.println(shape.square);

        //задаем параметры нашему объекту

        shape.setHeight(200);
        shape.getHeight();

        shape.setLength(144);
        shape.getLength();

        // выводим объект через метод

        shape.viewShape();
    }
}
