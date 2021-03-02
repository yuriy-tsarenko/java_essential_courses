package com.java_essential.Class_4.Task_2;
/*Создать класс Vehicle. В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки. Написать программу, которая выводит на экран информацию о каждом средстве передвижения.*/

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane("plane", 800000, 500.5, 2003, 1800, 1000);
        Vehicle car = new Car("car", 14000, 300.8, 2005);
        Vehicle ship = new Ship("ship", 900000, 200, 2018, 15000, "some port");

        plane.show();
        car.show();
        ship.show();
    }
}
