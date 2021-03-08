package com.java_essential.varycheva.essential.homework.hw2.task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2003);
        Car car3 = new Car(2003, 200);
        Car car4 = new Car(2003, 200, 1670);
        Car car5 = new Car(2003, 200, 1670, "blue");

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
    }
}
