package com.java_essential.Class_3.Task_1;
/*Создать класс Машина с полями год(int), цвет(String). Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
Создать класс Main в котором создать экземпляры вызывая разные конструкторы.*/

import com.java_essential.Class_3.Task_1.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(2014, "green");
    }
}
