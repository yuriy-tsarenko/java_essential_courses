package com.java_essential.Class_4.Task_2;
/* Создать класс Vehicle. В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки. Написать программу, которая выводит на экран информацию о каждом средстве передвижения.*/

public class Vehicle {
    private int price;
    private double speed;
    private int year;
    private String type;

    Vehicle() {
    }

    Vehicle(String type, int price, double speed, int year) {
        this.type = type;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    void show() {
        System.out.println("__________________________");
        System.out.println("type is - " + type);
        System.out.println("price is - " + price);
        System.out.println("speed is - " + speed);
        System.out.println("year is - " + year);
    }
}
