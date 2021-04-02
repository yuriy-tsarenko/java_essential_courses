package com.java_essential.tsarenko.lesson6.homework;

public class Vehicle {

    public void print() {
        System.out.println("some work...Vehicle");
    }

    public class Wheel {
        public void print() {
            System.out.println("some work...Wheel");
        }
    }

    public class Door extends Wheel {
        public void print() {
            System.out.println("some work...Door");
        }
    }
}
