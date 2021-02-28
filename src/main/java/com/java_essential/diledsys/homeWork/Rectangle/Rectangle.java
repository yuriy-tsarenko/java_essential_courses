package com.java_essential.diledsys.homeWork.Rectangle;
/*
Задание 2
   Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем
 Rectangle. В теле класса создать два поля, описывающие длины сторон double side1,
 double side2. Создать два метода, вычисляющие площадь прямоугольника –
 double areaCalculator (double side1, double side2) и периметр прямоугольника –
 double perimeterCalculator (double side1, double side2). Написать программу,
 которая принимает от пользователя длины двух сторон прямоугольника и выводит на
 экран периметр и площадь.
 */
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sid1=");
        double side1 =sc.nextDouble();
        System.out.print("sid1=");
        double side2 =sc.nextDouble();
        System.out.println();
        System.out.println("P = side1 * side2; P= "+areaCalculator(side1,side2));
        System.out.println("S = 2 * (side1 + side2) S= "+perimeterCalculator(side1,side2));

    }
    public static double areaCalculator (double side1, double side2){//P=a*b
        double S =side1*side2;
        return S;
    }
    public static double perimeterCalculator (double side1, double side2){//P=2(a+b)
        double P=2*(side1+side2);
        return P;
    }
}
