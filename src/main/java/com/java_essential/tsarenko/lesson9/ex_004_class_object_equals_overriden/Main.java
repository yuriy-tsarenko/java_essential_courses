package com.java_essential.tsarenko.lesson9.ex_004_class_object_equals_overriden;

public class Main {
    public static void main(String[] args) {
        // создаем объкты с одинаковыми параметрами

        Car car1 = new Car(2, "www");
        Car car2 = new Car(2, "sss");

        int hash = car1.hashCode();
        int hashTwo = car2.hashCode();
        System.out.println(hash);
        System.out.println(hashTwo);
        // метод equals сравнивает уже по инструкции, которую мы описали в перезаписанном методе сравниваемого класса
        System.out.println(car1.equals(car2));
    }
}
