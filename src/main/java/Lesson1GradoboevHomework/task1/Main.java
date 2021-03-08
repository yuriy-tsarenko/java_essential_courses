package Lesson1GradoboevHomework.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side1:");
        double side1 = in.nextDouble();
        System.out.println("Enter side2:");
        double side2 = in.nextDouble();
        Rectangle.areaCalculator(side1,side2);
        Rectangle.perimeterCalculator(side1,side2);

    }
    }

