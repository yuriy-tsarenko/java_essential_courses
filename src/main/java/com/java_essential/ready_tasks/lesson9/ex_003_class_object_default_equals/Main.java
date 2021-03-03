package com.java_essential.ready_tasks.lesson9.ex_003_class_object_default_equals;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2);
        Car car2 = new Car(2);
        Car car3 = car1;

        // сравниваем по ссылкам (разные объекты)
        System.out.println(car1.equals(car2));

        // ссылаемся на один и тот же объект
        System.out.println(car1.equals(car3));

        System.out.println(car1 == car2);

        System.out.println(car1 == car3);
    }
}
