package com.java_essential.varycheva.essential.homework.hw2.task1;

public class Car {

    private int year;
    private String color;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    Car() {
        this.year = 2005;
        this.color = "black";
    }

    Car(int year) {
        this.year = year;
        this.color = "red";
    }

    Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
