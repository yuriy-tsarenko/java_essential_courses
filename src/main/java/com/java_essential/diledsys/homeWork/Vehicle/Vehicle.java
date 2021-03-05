package com.java_essential.diledsys.homeWork.Vehicle;


public class Vehicle {
    private final String locationPosition;
    private final int price;
    private final double speed;
    private final String year;

    public Vehicle(String locationPosition, int price, double speed, String year) {
        this.locationPosition = locationPosition;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return " location Position: " + locationPosition + "\n" +
                " price: " + price + "\n" +
                " speed: " + speed + "\n" +
                " year: " + year + "\n";
    }


}
