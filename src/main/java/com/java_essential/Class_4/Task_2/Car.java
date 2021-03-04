package com.java_essential.Class_4.Task_2;
/* Создать класс Vehicle. В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки. Написать программу, которая выводит на экран информацию о каждом средстве передвижения.*/

public class Car extends Vehicle {
    Car(String type, int price, double speed, int year) {
        super(type, price, speed, year);
    }
}
