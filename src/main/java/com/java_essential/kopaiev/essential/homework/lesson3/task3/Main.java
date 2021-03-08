package com.java_essential.kopaiev.essential.homework.lesson3.task3;

public class Main {
    /*
    Задание 3
Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс Vehicle. В теле класса создайте поля:
координаты и параметры средств передвижения (цена, скорость, год выпуска). Создайте 3 производных класса Plane, Саг
и Ship. Для класса Plane должна быть определена высота и количество пассажиров. Для класса Ship – количество
пассажиров и порт приписки. Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
    */

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.askVehicleType();
    }
}
