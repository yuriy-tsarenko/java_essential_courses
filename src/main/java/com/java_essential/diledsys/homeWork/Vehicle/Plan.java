package com.java_essential.diledsys.homeWork.Vehicle;

public class Plan extends Vehicle {

    private final int palletHeight;
    private final int numberOfPassengers;

    public Plan(String locationPosition, int price, double speed, String year, int numberOfPassengers, int palletHeight) {
        super( locationPosition, price, speed, year );
        this.palletHeight = palletHeight;
        this.numberOfPassengers = numberOfPassengers;
    }


    @Override
    public String toString() {
        return "Plan" + "\n" + super.toString() +
                " palletHeight=" + palletHeight + "\n" +
                " numberOfPassengers=" + numberOfPassengers + "\n";
    }
}
