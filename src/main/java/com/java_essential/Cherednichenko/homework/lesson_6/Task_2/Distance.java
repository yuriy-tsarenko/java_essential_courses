package com.java_essential.Cherednichenko.homework.lesson_6.Task_2;

import com.java_essential.Cherednichenko.homework.lesson_1.Content;

//Задание 3
//        Создайте проект, используя IntelliJ IDEA.
//        Требуется: Создать класс Distance с полем distance типа double и методом print.
//        В классе Distance, создайте статический класс Converter с методами,
//        которые будут конвертировать расстояние в разные единицы измерения
//        (к примеру, из метров в километры, из километров в мили, и так далее).
public class Distance {
    double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void print() {
        System.out.println("Distance: " + distance);
    }

    public static class Converter {
        public static void fromCentimetersToMeters(double value) {
            System.out.println("Distance in Meters: " + (value * 100));
        }

        public static void fromMetersToKilometers(double value) {
            System.out.println("Distance in Kilometers: " + (value / 1000));
        }

        public static void fromKilometersToMile(double value) {
            System.out.println("Distance in Mile: " + (value * 0.621371192));
        }
    }

    public static void main(String[] args) {
        Distance distance = new Distance(1000);
        distance.print();
        Converter.fromCentimetersToMeters(distance.getDistance());
        Converter.fromMetersToKilometers(distance.getDistance());
        Converter.fromKilometersToMile(distance.getDistance());
    }
}
