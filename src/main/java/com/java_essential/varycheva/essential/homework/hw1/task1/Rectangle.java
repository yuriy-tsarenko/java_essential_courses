package com.java_essential.varycheva.essential.homework.hw1.task1;

public class Rectangle {

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2){
        if (side1 <= 0 || side2 <= 0){
            throw new IllegalArgumentException("Сторона должна быть положительным числом");
        } else {
            this.side1 = side1;
            this.side2 = side2;
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double areaCalculator() {
        return side1 * side2;
    }

    public double perimeterCalculator() {
        return 2 * side1 + 2 * side2;
    }
}
