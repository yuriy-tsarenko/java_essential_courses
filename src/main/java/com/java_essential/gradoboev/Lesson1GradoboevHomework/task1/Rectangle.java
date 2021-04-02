package com.java_essential.gradoboev.Lesson1GradoboevHomework.task1;

public class Rectangle {
    public double side1;
    public double side2;



    public static void areaCalculator (double side1, double side2) {
        double s = side1 * side2;
        System.out.println(s);
    }
    public static void perimeterCalculator (double side1, double side2) {
        double p = 2 * (side1 + side2);
        System.out.println(p);
    }

}
