package com.java_essential.tsarenko.lesson6.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(10, "Car Brand", 1);
        Bicycle bicycle1 = new Bicycle("Bicycle brand", 2);
        System.out.println("car1: " + car1);
        System.out.println("bicycle1: " + bicycle1);
        System.out.println("_____________________");
        Bicycle bicycle2 = Mapper.mapCarToBicycle(car1);
        Car car2 = Mapper.mapBicycleToCar(bicycle1, 20);
        System.out.println("bicycle2: " + bicycle2);
        System.out.println("car2: " + car2);
        System.out.println("_____________________");

    }
}
