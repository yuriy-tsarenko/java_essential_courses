package com.java_essential.diledsys.homeWork.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Ship( "Haifa Port", 1000000, 50, "2003", 100 );
        vehicles[1] = new Car( "Magazin Aviz", 150000, 220, "2018" );
        vehicles[2] = new Plan( "Aeraport Bengurion", 500000, 500, "2007", 12, 1200 );
        for (Vehicle vehicle : vehicles) {
            System.out.println( vehicle.toString() );
        }
    }
}
