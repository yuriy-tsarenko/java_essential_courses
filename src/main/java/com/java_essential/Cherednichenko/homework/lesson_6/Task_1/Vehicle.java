package com.java_essential.Cherednichenko.homework.lesson_6.Task_1;

public class Vehicle {
    public void print() {
        System.out.println("Vehicle print()");
    }

    public class Wheel {
        public void print() {
            System.out.println("Wheel print()");
        }
    }

    public class Door {
        public void print() {
            System.out.println("Door print()");
        }
    }

    public static void main(String[] args) {
        Vehicle.Door door = new Vehicle().new Door();
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle vehicle = new Vehicle();
        vehicle.print();
        door.print();
        wheel.print();

    }
}
