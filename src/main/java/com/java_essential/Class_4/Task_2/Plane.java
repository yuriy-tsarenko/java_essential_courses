package com.java_essential.Class_4.Task_2;
/* Создать класс Vehicle. В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки. Написать программу, которая выводит на экран информацию о каждом средстве передвижения.*/

public class Plane extends Vehicle {
    private double height;
    private int countOfPassengers;

    Plane(String type, int price, double speed, int year, double height, int countOfPassengers) {
        super(type, price, speed, year);
        this.height = height;
        this.countOfPassengers = countOfPassengers;
    }

    @Override
    void show() {
        super.show();
        System.out.println("height is - " + height);
        System.out.println("countOfPassengers is - " + countOfPassengers);
    }
}
