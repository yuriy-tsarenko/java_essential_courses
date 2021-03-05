package com.java_essential.ready_tasks.lesson9.ex_001_class_object.declaration;

// класс Car неявно унаследует класс Object

public class Main {
    public static void main(String[] args) {
        // Создали объект класса Car. У него уже есть методы класса Object.
        // объект класса Car тоже имеет методы класса Object
        Car car = new Car();
        Car carTwo = new Car();

        int hashCode = car.hashCode();
        int hashCodeTwo = carTwo.hashCode();

        boolean equals = car.equals(carTwo);

        System.out.println(hashCode);
        System.out.println(hashCodeTwo);
        System.out.println(equals);
        System.out.println(car.toString());
    }
}

// класс Car явно наследуется от класса Object
class Car {

}
