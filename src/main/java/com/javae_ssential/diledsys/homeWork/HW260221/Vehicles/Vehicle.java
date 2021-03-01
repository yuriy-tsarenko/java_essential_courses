package com.javae_ssential.diledsys.homeWork.HW260221.Vehicles;

public class Vehicle {

    public void print() {

    }

    public class Wheel extends Vehicle {
        int count = 0;

        @Override
        public void print() {
            if (count == 0) System.out.println("new copy");
            ++count;
            System.out.println("Iam Wheel->" + count);
        }
    }

    public class Door extends Vehicle {
        @Override
        public void print() {
            System.out.println("Iam Door");

        }
    }

    public static void main(String[] args) {
        // new copy
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();
wheel.print();
door.print();
    }
}
