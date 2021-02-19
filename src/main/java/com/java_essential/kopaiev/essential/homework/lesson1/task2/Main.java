package com.java_essential.kopaiev.essential.homework.lesson1.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        rectangleCalculation();
    }

    public static void rectangleCalculation() {
        double side1;
        double side2;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Hi, type first value");
            if (sc.hasNextDouble()) {
                side1 = sc.nextDouble();
                System.out.println("Hi, type second value");
                if (sc.hasNextDouble()) {
                    side2 = sc.nextDouble();
                    break;
                }
            }
            System.out.println("Wrong input");

        }

        Rectangle rectangle = new Rectangle(side1, side2);

        System.out.println("Triangle area is " + rectangle.areaCalculator(side1, side2));
        System.out.println("Triangle perimeter is " + rectangle.perimeterCalculator(side1, side2));

    }
}
