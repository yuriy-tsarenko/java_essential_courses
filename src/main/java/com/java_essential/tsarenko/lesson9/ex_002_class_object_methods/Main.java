package com.java_essential.tsarenko.lesson9.ex_002_class_object_methods;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(160, "blue");

        System.out.println(car.getClass());

        // благодар¤ перезаписаному методу toString выведет информацию в нужном нам виде
        System.out.println(car);
    }
}
