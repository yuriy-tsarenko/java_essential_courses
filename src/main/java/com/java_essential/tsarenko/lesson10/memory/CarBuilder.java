package com.java_essential.tsarenko.lesson10.memory;

class Car {
    int id;
    String brand;

    public Car(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }
}

public class CarBuilder {
    private static Car buildCar(int id, String brand) {
        return new Car(id, brand);
    }

    public static void main(String[] args) {
        int id = 23;
        String name = "John";
        Car person = null;
        person = buildCar(id, name);
    }
}

