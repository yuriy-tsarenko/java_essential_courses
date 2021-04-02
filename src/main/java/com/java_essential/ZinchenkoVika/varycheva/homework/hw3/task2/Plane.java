package com.java_essential.ZinchenkoVika.varycheva.homework.hw3.task2;

public class Plane extends Vehicle {

    private int height;
    private int passengersNumber;

    public Plane(float price, double speed, int releaseYear, int height, int passengersNumber) {
        super(price, speed, releaseYear);
        this.height = height;
        this.passengersNumber = passengersNumber;
    }

    public int getHeight(){
        return height;
    }

    public int getPassengersNumber(){
        return passengersNumber;
    }

    @Override
    public String toString(){
        return  super.toString() + " height= " + getHeight() + " numberOfPassengers= " + getPassengersNumber();
    }
}
