package com.java_essential.ZinchenkoVika.Vehicle;

public class Main {
    public static void main(String[] args) {
        // For car:
        Car car = new Car();
        car.setPrice(100000);
        car.setSpeed(195);
        car.setYear(2000);
        System.out.println("Car: price - " + car.getPrice() + ", speed - " + car.getSpeed() + ", year - " + car.getYear());
        // For plane:
        Plane plane = new Plane();
        plane.setPrice(1540000);
        plane.setSpeed(1245);
        plane.setYear(1999);
        plane.setHeight(1500);
        plane.setPassengersPlane(6);
        System.out.println("Plane: price - " + plane.getPrice() + ", speed - " + plane.getSpeed() + ", year - " + plane.getYear() + ", height - " + plane.getHeight() + ", passengers - " + plane.getPassengersPlane());
        // For ship:
        Ship ship = new Ship();
        ship.setPrice(284650000);
        ship.setSpeed(90);
        ship.setYear(2015);
        ship.setPassengersShip(1500);
        ship.setPortOfRegistration("Odessa");
        System.out.println("Ship: price - " + ship.getPrice() + ", speed - " + ship.getSpeed() + ", year - " + ship.getYear() + ", passengers - " + ship.getPassengersShip() + ", port of registration - " + ship.getPortOfRegistration());
    }
}
