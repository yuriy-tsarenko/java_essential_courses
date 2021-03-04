package com.java_essential.Class_3.Task_2;
/* Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы вызывая конструктор из конструктора.
Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.*/

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String colour;

    Car(){}

    Car(int year){
        this.year = year;
    }

    Car(int year, double speed){
        this(year);
        this.speed = speed;
    }

    Car(int year, double speed, int weight){
        this(year, speed);
        this.weight = weight;
    }

    Car(int year, double speed, int weight, String colour){
        this(year, speed, weight);
        this.colour = colour;
    }

}
