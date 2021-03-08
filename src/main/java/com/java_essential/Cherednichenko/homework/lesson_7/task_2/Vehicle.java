package com.java_essential.Cherednichenko.homework.lesson_7.task_2;

import java.util.Arrays;

public class Vehicle {
    public enum Vehicles {
        CAR(200, "Red"),
        BUS(1000, "Blue"),
        BICYCLE(100, "Black"),
        BIKE(300, "Yellow");
        private final int price;
        private final String color;

        Vehicles(int price, String color) {
            this.price = price;
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "" + name() + "{" +
                    "price=" + price +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Vehicles[] vehicles = Vehicles.values();
        for (Vehicles v : vehicles) {
            System.out.println(v.name() + " " + v.getColor());
        }
        System.out.println(Arrays.toString(Vehicles.values()));
    }
}
