package com.java_essential.kopaiev.essential.homework.lesson1.task2;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle (double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    double areaCalculator (double side1, double side2)
    {
        double area = side1 * side2;
        return  area;
    }

    double perimeterCalculator (double side1, double side2)
    {
        double perimeter = (side1 + side2) * 2;
        return perimeter;
    }
}


