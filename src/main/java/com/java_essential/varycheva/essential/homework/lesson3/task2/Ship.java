package com.java_essential.varycheva.essential.homework.lesson3.task2;

public class Ship extends Vehicle {

    private int homePort;
    private int passengersNumber;

    public Ship(float price, double speed, int releaseYear, int passengersNumber, int homePort) {
        super(price, speed, releaseYear);
        this.homePort = homePort;
        this.passengersNumber = passengersNumber;
    }

    @Override
    public String toString(){
        return  super.toString() + " homePort= " + homePort + " numberOfPassengers= " + passengersNumber;
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
