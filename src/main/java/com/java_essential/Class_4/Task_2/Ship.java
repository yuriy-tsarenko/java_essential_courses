package com.java_essential.Class_4.Task_2;
/* Создать класс Vehicle. В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки. Написать программу, которая выводит на экран информацию о каждом средстве передвижения.*/

public class Ship extends Vehicle {
    private int countOfPassengers;
    private String port;

    Ship(String type, int price, double speed, int year, int countOfPassengers, String port) {
        super(type, price, speed, year);
        this.countOfPassengers = countOfPassengers;
        this.port = port;
    }

    @Override
    void show() {
        super.show();
        System.out.println("port is - " + port);
        System.out.println("countOfPassengers is - " + countOfPassengers);
    }
}
