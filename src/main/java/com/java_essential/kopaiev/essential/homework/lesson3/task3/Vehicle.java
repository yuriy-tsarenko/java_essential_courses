package com.java_essential.kopaiev.essential.homework.lesson3.task3;

import java.util.Scanner;

public class Vehicle {
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;
    private float price;
    private float speed;
    private int year;

    public Vehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Please set price");
        price = scanner.nextFloat();
        System.out.println("Hi, Please set speed");
        speed = scanner.nextFloat();
        System.out.println("Hi, Please set year");
        year = scanner.nextInt();
        coordinateX = Math.random();
        coordinateY = Math.random();
        coordinateZ = Math.random();
    }

    @Override
    public String toString() {
        return  " coordinateX = " + coordinateX
                + ", coordinateY = " + coordinateY
                + ", coordinateZ = " + coordinateZ
                + ", price = " + price
                + ", speed = " + speed
                + ", year = " + year + "";
    }
}
