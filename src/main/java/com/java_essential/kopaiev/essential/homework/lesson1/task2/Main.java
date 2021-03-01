package com.java_essential.kopaiev.essential.homework.lesson1.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        rectangleCalculation();
    }

    public static void rectangleCalculation() {
        Scanner sc = new Scanner(System.in);
        double side1, side2;

        System.out.println("Hi, type first value");
        side1 = sc.nextDouble();
        System.out.println("Hi, type second value");
        side2 = sc.nextDouble();


        Rectangle rectangle = new Rectangle(side1, side2);

        System.out.println("Triangle area is " + rectangle.areaCalculator(side1, side2));
        System.out.println("Triangle perimeter is " + rectangle.perimeterCalculator(side1, side2));
    }
}
