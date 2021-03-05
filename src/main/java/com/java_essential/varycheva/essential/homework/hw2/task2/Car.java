package com.java_essential.varycheva.essential.homework.hw2.task2;

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
        this.speed = 220;
        this.weight = 1150;
        this.color = "black";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 1150;
        this.color = "white";
    }

    public Car(int year, double speed, double weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "green";
    }

    public Car(int year, double speed, double weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
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
