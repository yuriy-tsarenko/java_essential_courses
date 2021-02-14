package com.java_essential.lesson_1;

import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner in = new Scanner(System.in);
        System.out.print("Side 1: ");
        double side1 = in.nextDouble();
        System.out.print("Side 2: ");
        double side2 = in.nextDouble();
        in.close();
        System.out.print("Area:"+rectangle.areaCalculator(side1,side2)+" Perimeter:"+rectangle.perimeterCalculator(side1,side2));
    }
public Rectangle() {}
public double areaCalculator(double side1, double side2)
{
    return side1*side2;
}
public double perimeterCalculator(double side1, double side2)
{
    return (side1+side2)*2;
}
}
