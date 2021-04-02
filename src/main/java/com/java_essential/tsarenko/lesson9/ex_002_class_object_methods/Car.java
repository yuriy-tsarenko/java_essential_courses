package com.java_essential.tsarenko.lesson9.ex_002_class_object_methods;

public class Car {
    // создаем поля
    private int speed;
    private String color;

    // конструктор
    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    // методы доступа
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // перезаписываем метод toString класса Object так как мы считаем нужно

    @Override
    public String toString() {
        return String.format("Speed is: %s\nColor is: %s", speed, color);
    }

    // изначально он выглядит как указано ниже и возвращает место занимаемое объектом в памяти

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
