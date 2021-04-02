package com.java_essential.ZinchenkoVika.varycheva.homework.hw7.task2;


public enum Vehicles {
    MAZDA(45000, "red"),
    NISSAN(56000, "blue"),
    HYUNDAI(25000, "white");
    private double price;
    private String color;

    Vehicles(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "name=" + this.name() +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
