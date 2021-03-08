package com.java_essential.kopaiev.essential.homework.lesson3.task3;

import java.util.Scanner;

public class Ship extends Vehicle {
    private int passangersCpacity;
    private String destinationPort;

    public Ship() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select passenger capacity ");
        passangersCpacity = scanner.nextInt();
        System.out.println("Please, select destination port");
        destinationPort = scanner.next();
    }

    @Override
    public String toString() {

        return super.toString() + ", type: ship, " + "passangersCpacity=" + passangersCpacity
                + ", destinationPort='" + destinationPort + '\'' + '}';
    }
}
