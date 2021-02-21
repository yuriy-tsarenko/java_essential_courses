package com.java_essential.kopaiev.essential.homework.lesson2.task4;

public class Main {
    public static void main(String[] args) {
        Car withoutParameterCar = new Car();
        Car oneParameterCar = new Car(2010);
        Car twoParameterCar = new Car(2010, 300);
        Car threeParameterCar = new Car(2015, 320, 1500);
        Car fourParameterCar = new Car(2005, 220, 3500, "blue");
    }
}
