package com.java_essential.kopaiev.essential.homework.lesson6.task2;

public class Vehicle {

    /*
    Задание 2
    Создайте проект, используя IntelliJ IDEA. Требуется: Создать класс Vehicle с методом print.
    В классе Vehicle, создайте внутренний класс Wheel и Door, которые также должны содержать метод print.
    Создайте экземпляры классов Wheel и Door.
    */

    private void print(){
    System.out.println("Method Print from basic class");
    }

    public class Wheel {
        void print() {
            System.out.println("Method print from Wheel class");
        }
    }

    public class Door {
        void print() {
            System.out.println("Method print from Door class");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Door door = vehicle.new Door();
        Vehicle.Wheel wheel = vehicle.new Wheel();

        door.print();
        wheel.print();
    }
}
