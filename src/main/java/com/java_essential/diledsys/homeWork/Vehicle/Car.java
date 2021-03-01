package com.java_essential.diledsys.homeWork.Vehicle;

public class Car extends Vehicle {

    public Car(String locationPosition, int price, double speed, String year) {
        super( locationPosition, price, speed, year );
    }

    @Override
    public String toString() {
        return "Car " + super.toString();
    }
}
