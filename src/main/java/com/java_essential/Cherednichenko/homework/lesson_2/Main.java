package com.java_essential.Cherednichenko.homework.lesson_2;

public class Main {
    public static void main(String[] args) {
        //Task#1
        System.out.println("Task#1");
        Car_1 car_1 = new Car_1();
        System.out.println("Car_1 color: " + car_1.getColor() + " Car_1 year: " + car_1.getYear());
        Car_1 car_11 = new Car_1(1969);
        System.out.println("Car_1 color: " + car_11.getColor() + " Car_1 year: " + car_11.getYear());
        Car_1 car_12 = new Car_1(1969, "Red");
        System.out.println("Car_1 color: " + car_12.getColor() + " Car_1 year: " + car_12.getYear());

        //Task#2
        System.out.println("Task#2");
        Car_2 car_2 = new Car_2();
        System.out.println("Car_2 year: " + car_2.getYear() + " Car_2 speed: " + car_2.getSpeed() + " Car_2 weight: " + car_2.getWeight() + " Car_2 color: " + car_2.getColor());
        Car_2 car_21 = new Car_2(1969);
        System.out.println("Car_2 year: " + car_21.getYear() + " Car_2 speed: " + car_21.getSpeed() + " Car_2 weight: " + car_21.getWeight() + " Car_2 color: " + car_21.getColor());
        Car_2 car_22 = new Car_2(1969, 80.65);
        System.out.println("Car_2 year: " + car_22.getYear() + " Car_2 speed: " + car_22.getSpeed() + " Car_2 weight: " + car_22.getWeight() + " Car_2 color: " + car_22.getColor());
        Car_2 car_23 = new Car_2(1969, 80.65, 3500);
        System.out.println("Car_2 year: " + car_23.getYear() + " Car_2 speed: " + car_23.getSpeed() + " Car_2 weight: " + car_23.getWeight() + " Car_2 color: " + car_23.getColor());
        Car_2 car_24 = new Car_2(1969, 80.65, 3500, "Red");
        System.out.println("Car_2 year: " + car_24.getYear() + " Car_2 speed: " + car_24.getSpeed() + " Car_2 weight: " + car_24.getWeight() + " Car_2 color: " + car_24.getColor());

        //Task#
        System.out.println("Task#3");
        Car_3 car_3 = new Car_3();
        System.out.println("Car_3 year: " + car_3.getYear() + " Car_3 speed: " + car_3.getSpeed() + " Car_3 weight: " + car_3.getWeight() + " Car_3 color: " + car_3.getColor());
        Car_3 car_31 = new Car_3(1969);
        System.out.println("Car_32 year: " + car_31.getYear() + " Car_3 speed: " + car_31.getSpeed() + " Car_3 weight: " + car_31.getWeight() + " Car_3 color: " + car_31.getColor());
        Car_3 car_32 = new Car_3(1969, 80.65);
        System.out.println("Car_2 year: " + car_32.getYear() + " Car_3 speed: " + car_32.getSpeed() + " Car_3 weight: " + car_32.getWeight() + " Car_3 color: " + car_32.getColor());
        Car_3 car_33 = new Car_3(1969, 80.65, 3500);
        System.out.println("Car_3 year: " + car_33.getYear() + " Car_3 speed: " + car_33.getSpeed() + " Car_3 weight: " + car_33.getWeight() + " Car_3 color: " + car_33.getColor());
        Car_3 car_34 = new Car_3(1969, 80.65, 3500, "Red");
        System.out.println("Car_3 year: " + car_34.getYear() + " Car_3 speed: " + car_34.getSpeed() + " Car_3 weight: " + car_34.getWeight() + " Car_3 color: " + car_34.getColor());

    }
}
