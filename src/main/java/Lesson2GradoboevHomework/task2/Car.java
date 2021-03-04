package Lesson2GradoboevHomework.task2;

public class Car {
    int year;
    String color;

    public Car() {
        year = 2021;
        color = "white";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
