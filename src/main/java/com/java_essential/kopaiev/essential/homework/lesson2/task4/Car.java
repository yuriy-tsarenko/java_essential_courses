package com.java_essential.kopaiev.essential.homework.lesson2.task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }
}
