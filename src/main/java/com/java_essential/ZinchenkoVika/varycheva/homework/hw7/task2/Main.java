package com.java_essential.ZinchenkoVika.varycheva.homework.hw7.task2;

/*
Создайте перечислительный тип (enum) Vehicles,
содержащий конструктор, который должен принимать целочисленное значение (стоимость автомобиля),
содержать метод getColor(), который возвращает строку с цветом автомобиля, и содержать перегруженный метод toString(),
который должен возвращать строку с названием экземпляра, цветом и стоимостью автомобиля.
 */
public class Main {
    public static void main(String[] args) {
        for (Vehicles vehicle : Vehicles.values()) {
            System.out.println(vehicle.toString());
        }
    }
}
