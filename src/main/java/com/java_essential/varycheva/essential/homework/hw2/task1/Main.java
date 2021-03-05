package com.java_essential.varycheva.essential.homework.hw2.task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(1990, "blue");
        Car car3 = new Car(2000);

        System.out.println(car1.getYear() + " " + car1.getColor());
        System.out.println(car2.getYear() + " " + car2.getColor());
        System.out.println(car3.getYear() + " " + car3.getColor());
    }
}
