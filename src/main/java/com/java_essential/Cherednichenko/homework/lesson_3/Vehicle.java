package com.java_essential.Cherednichenko.homework.lesson_3;

public class Vehicle {
    private String coordinates;
    private String price;
    private String speed;
    private String year_of_issue;

    public Vehicle(String coordinates, String price, String speed, String year_of_issue) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year_of_issue = year_of_issue;
    }
    protected void show(){
        System.out.print("Coordinates: "+coordinates+", Price: "+price+", Speed: "+speed+", Year_of_issue: "+year_of_issue+", ");
    }

    public static void main(String[] args) {
        Vehicle plane =new Plane("Coordinates","$$$$$","2000","1999","100km","200");
        Vehicle ship = new Ship("Coordinates","$$$$$","2000","1999","Name_Port","1500");
        Vehicle car = new Car("Coordinates","$$$$$","2000","1999");
        plane.show();
        ship.show();
        car.show();
    }
}
