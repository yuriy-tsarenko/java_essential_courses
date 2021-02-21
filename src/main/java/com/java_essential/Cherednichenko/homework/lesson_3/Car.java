package com.java_essential.Cherednichenko.homework.lesson_3;

public class Car extends Vehicle{
    public Car(String coordinates, String price, String speed, String year_of_issue) {
        super(coordinates, price, speed, year_of_issue);
    }

    @Override
    protected void show() {
        System.out.println("Car: ");
        super.show();
        System.out.println(". ");
    }
}
