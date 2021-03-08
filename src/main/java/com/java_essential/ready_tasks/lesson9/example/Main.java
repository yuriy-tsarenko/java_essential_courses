package com.java_essential.ready_tasks.lesson9.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1, "vehicle");
        Bike bike = new Bike(1, "vehicle");
        Bike bike2 = new Bike(1, "vehicle");

        Set<Bike> bikes = new HashSet<>();
        bikes.add(bike);
        bikes.add(bike2);
        bikes.forEach(b-> System.out.println(b));

        int carHash = vehicle.hashCode();
        int bikeHash = bike.hashCode();

        System.out.println(carHash);
        System.out.println(bikeHash);

        System.out.println(vehicle.getClass());
        System.out.println(bike.getClass());

        System.out.println(vehicle.equals(bike));




    }
}

