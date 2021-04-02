package com.java_essential.ZinchenkoVika.varycheva.homework.hw3.task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(50000, 240, 2011);
        car.printInfo();

        Ship ship = new Ship(50000, 240, 2011, 40, 3);
        ship.printInfo();

        Plane plane = new Plane(50000, 240, 2011, 367, 3);
        plane.printInfo();
    }
}
