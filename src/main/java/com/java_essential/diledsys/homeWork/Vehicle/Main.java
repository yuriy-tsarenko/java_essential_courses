package com.java_essential.diledsys.homeWork.Vehicle;

public class Main {

    public static void main(String[] args) {


        Ship ship = new Ship( "Haifa Port", 1000000, 50, "2003", 100 );
        Car car = new Car( "Magazin Aviz", 150000, 220, "2018" );
        Plan plan = new Plan( "Aeraport Bengurion", 500000, 500, "2007", 12, 1200 );
        System.out.println( ship.toString() );
        System.out.println( car.toString() );
        System.out.println( plan.toString() );

    }


}
