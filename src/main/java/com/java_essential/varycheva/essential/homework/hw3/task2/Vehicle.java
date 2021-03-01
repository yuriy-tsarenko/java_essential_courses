package com.java_essential.varycheva.essential.homework.hw3.task2;

public class Vehicle {

    protected float price;
    protected double speed;
    protected int releaseYear;

    public Vehicle(float price, double speed, int releaseYear) {
        this.price = price;
        this.speed = speed;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return String.format("price= %s; speed= %s; releaseYear= %s;", this.price, this.speed, this.releaseYear);
    }

    public void printInfo(){
        System.out.println(toString());
    }
}
