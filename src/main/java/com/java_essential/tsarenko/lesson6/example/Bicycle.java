package com.java_essential.tsarenko.lesson6.example;

public class Bicycle {
    private String brand;
    private int id;

    public Bicycle() {
    }

    public Bicycle(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", id=" + id +
                '}';
    }
}
