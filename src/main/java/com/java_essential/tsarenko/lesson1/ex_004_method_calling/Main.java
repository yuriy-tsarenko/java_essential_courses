package com.java_essential.tsarenko.lesson1.ex_004_method_calling;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        // вызываем метод класса Car через обьект car1
        car1.setMaxSpeed(140);
        int speed = car1.getMaxSpeed();
        System.out.println(speed);

        // вызываем метод класса Car через обьект car2
        // car2.maxSpeed; // к приватным не имеем доступа из других классов
        car2.setMaxSpeed(150);
        System.out.println(car2.getMaxSpeed());
    }
}
