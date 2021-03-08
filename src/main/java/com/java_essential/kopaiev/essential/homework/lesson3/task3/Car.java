package com.java_essential.kopaiev.essential.homework.lesson3.task3;

public class Car extends Vehicle {

    public Car() {
        super();
    }

    @Override
    public String toString() {
        return "type: car, " + super.toString();
    }
}
