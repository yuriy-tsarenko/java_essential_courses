package com.java_essential.diledsys.homeWork.task4_Car;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(int year) {
        this.year = year;
    }
    public Car( String color,double speed, int weight,int year) {
        this(year,speed);   //вызов конструктора из конструктора
        this.color = color;
        this.weight = weight;
    }
    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;

    }


}
