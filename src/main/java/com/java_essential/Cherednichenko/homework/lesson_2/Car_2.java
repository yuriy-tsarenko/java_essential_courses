package com.java_essential.Cherednichenko.homework.lesson_2;

public class Car_2 {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car_2(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Car_2(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car_2(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car_2(int year) {
        this.year = year;
    }

    public Car_2() {
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
