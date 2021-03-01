package com.java_essential.Cherednichenko.homework.lesson_3;

public class Ship extends Vehicle {
    private String port;
    private String number_of_passengers;

    public Ship(String coordinates, String price, String speed, String year_of_issue, String port, String number_of_passengers) {
        super(coordinates, price, speed, year_of_issue);
        this.port = port;
        this.number_of_passengers = number_of_passengers;
    }

    @Override
    protected void show() {
        System.out.println("Ship: ");
        super.show();
        System.out.println("Port: " + port + ", Number of passengers: " + number_of_passengers + ".");
    }
}
