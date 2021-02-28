package com.java_essential.kopaiev.essential.homework.lesson6.task3;

public class Distance {

    /*
    Задание 3
    Требуется: Создать класс Distance с полем distance типа double и методом print. В классе Distance,
    создайте статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы измерения
    (к примеру, из метров в километры, из километров в мили, и так далее).
    */

    double distance;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void print() {
        System.out.println("You set distance = " + getDistance());
    }


    public static class Converter {

        public double metresIntoKM(double distance) {
            return distance / 1000;
        }

        public double kilometersInMeters(double distance) {
            return distance * 1000;
        }

        public double metersInFt(double distance) {
            return distance * 3.28084;
        }

        public double kilometersInMiles(double distance) {
            return distance * 0.62137121212121;
        }

        public double ftInMeters(double distance) {
            return distance / 3.28084;
        }

        public double milesInKilometers(double distance) {
            return distance / 0.62137121212121;
        }
    }

    public static void main(String[] args) {
        Distance distance = new Distance();
        Converter converter = new Distance.Converter();

        distance.setDistance(1313134);
        distance.print();

        System.out.println("Distance in Meters = " + converter.ftInMeters(distance.getDistance()));
    }
}
