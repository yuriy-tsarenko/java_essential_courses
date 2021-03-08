package com.java_essential.kopaiev.essential.homework.lesson3.task3;

import java.util.Locale;
import java.util.Scanner;

public class Printer {
    public void askVehicleType() {
        System.out.println("Hi, Please choose type of vehicle ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next().toLowerCase(Locale.ROOT);
        String startMessage = "Here is information about your vehicle: ";

        switch (choice) {
            case "plane":
                Plane plane = new Plane();
                System.out.println(startMessage + plane);
                break;
            case "car":
                Car car = new Car();
                System.out.println(startMessage + car);
                break;
            case "ship":
                Ship ship = new Ship();
                System.out.println(startMessage + ship);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
