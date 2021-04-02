package com.java_essential.tsarenko.lesson9.ex_005_class_object_hash_code;

public class Main {
    public static void main(String[] args) {
        // создаем объекты, 2 из них содержат одинаковые параметры
        Car car1 = new Car(12);
        Car car2 = new Car(12);
        Car car3 = new Car(15);

        // вызываем метод hashCode, каков будет результат?
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
