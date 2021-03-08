package Lesson2GradoboevHomework.task3;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        year = 2010;
        speed = 230;
        weight = 2500;
        color = "black";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
    @Override
    public String toString() {
        return "year = " + year + " speed = " + speed + " weight = " + weight + " color = " + color;
    }

}
