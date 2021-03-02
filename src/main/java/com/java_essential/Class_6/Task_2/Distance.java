package com.java_essential.Class_6.Task_2;
/*Создать класс Distance с полем distance типа double и методом print.
В классе Distance, создайте статический класс Converter с методами, которые будут конвертировать расстояние
в разные единицы измерения (к примеру, из метров в километры, из километров в мили, и так далее).*/

public class Distance {
    public static double distance = 12.2;

    void print() {
        System.out.println("Distance is - " + distance);
    }

    public static class Converter {
        static double convertFromMetersToKilometers(double distance) {
            return distance * 1000;
        }

        static double convertFromKilometersToMile(double distance) {
            return distance * 0.62137;
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Miles - " + Distance.Converter.convertFromKilometersToMile(Distance.distance));
        System.out.println("Kilometers - " + Distance.Converter.convertFromMetersToKilometers(Distance.distance));
    }
}
