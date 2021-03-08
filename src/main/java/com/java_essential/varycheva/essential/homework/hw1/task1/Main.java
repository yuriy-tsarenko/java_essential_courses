package com.java_essential.varycheva.essential.homework.hw1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();

        if((side1 <= 0) || (side2 <= 0)) {
            System.out.println("Сторона должна быть положительным числом");
        } else {
            Rectangle rectangle = new Rectangle(side1, side2);
            System.out.println(rectangle.areaCalculator());
            System.out.println(rectangle.perimeterCalculator());
        }
    }
}
