package com.java_essential.kopaiev.essential.homework.lesson3.task3;

import java.util.Scanner;

public class Plane extends Vehicle {
    private float high;
    private int capacity;

    public Plane() {

        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select planes high");
        high = scanner.nextFloat();
        System.out.println("Please, select planes capacity");
        capacity = scanner.nextInt();
    }

    @Override
    public String toString() {

        return super.toString() + ", type: plane, " + "high = " + high
                + ", Planes capacity = " + capacity + '\'';
    }
}
