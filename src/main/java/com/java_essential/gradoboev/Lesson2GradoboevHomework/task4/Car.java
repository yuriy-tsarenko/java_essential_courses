package com.java_essential.gradoboev.Lesson2GradoboevHomework.task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        year = 2010;
        speed = 270;
        weight = 2000;
        color = "black";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this (year);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this (year, speed, weight);
        this.color = color;
    }
    @Override
    public String toString() {
        return "Year = " + year + " Speed = " + speed + " Weight = " + weight + " Color = " + color;
    }
}


