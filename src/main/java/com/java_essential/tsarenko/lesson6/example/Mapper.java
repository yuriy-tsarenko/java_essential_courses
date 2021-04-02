package com.java_essential.tsarenko.lesson6.example;

public final class Mapper {

    private Mapper() {
    }

    public static Car mapBicycleToCar(Bicycle bicycle, int averageValue) {
        Car car = new Car();
        car.setId(bicycle.getId());
        car.setBrand(bicycle.getBrand());
        car.setAverage(averageValue);
        return car;
    }

    public static Bicycle mapCarToBicycle(Car car) {
        Bicycle bicycle = new Bicycle();
        bicycle.setId(car.getId());
        bicycle.setBrand(car.getBrand());
        return bicycle;
    }
}
