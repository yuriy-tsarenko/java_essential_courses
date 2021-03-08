package com.java_essential.Class_3.Task_3;
/* Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы. Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.*/

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(1984);
        Car c3 = new Car(1999, 260.45);
        Car c4 = new Car(2005, 300.59, 3);
        Car c5 = new Car(2008, 310.4, 2, "yellow");
    }
}
