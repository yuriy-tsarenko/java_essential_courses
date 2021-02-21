package com.java_essential.Cherednichenko.homework.lesson_3;

public class Plane extends Vehicle {
    private String height;
    private String number_of_passengers;

    public Plane(String coordinates, String price, String speed, String year_of_issue, String height, String number_of_passengers) {
        super(coordinates, price, speed, year_of_issue);
        this.height = height;
        this.number_of_passengers = number_of_passengers;
    }

    @Override
    protected void show() {
        System.out.println("Plane: ");
        super.show();
        System.out.println("Height: " + height + ", Number of passengers: " + number_of_passengers + ".");
    }
}
