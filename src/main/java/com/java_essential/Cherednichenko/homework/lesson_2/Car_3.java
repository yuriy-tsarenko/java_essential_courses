package com.java_essential.Cherednichenko.homework.lesson_2;

public class Car_3 {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car_3(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    public Car_3(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car_3(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car_3(int year) {
        this.year = year;
    }

    public Car_3() {
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
