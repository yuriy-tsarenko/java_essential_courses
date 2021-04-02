package com.java_essential.ZinchenkoVika.varycheva.homework.hw2.task3;

public class Car {

    private int year;
    private double speed;
    private double weight;
    private String color;

    public Car() {
        this.year = 2010;
        this.speed = 100;
        this.weight = 935;
        this.color = "red";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car(int year, double speed, double weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, double weight, String color) {
       this(year, speed, weight);
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
