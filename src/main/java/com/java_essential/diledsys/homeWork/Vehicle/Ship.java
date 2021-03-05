package com.java_essential.diledsys.homeWork.Vehicle;

public class Ship extends Vehicle {

    private final String homePort;
    private final int numberOfPassengers;

    public Ship(String locationPosition, int price, double speed, String year, int numberOfPassengers) {
        super( locationPosition, price, speed, year );
        this.homePort = locationPosition;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Ship \n" +
                super.toString() +
                " number of passengers: " + numberOfPassengers + "\n";

    }
}



