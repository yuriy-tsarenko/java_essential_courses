package com.java_essential.ready_tasks.lesson9.ex_006_class_object_hash_code_overriden;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("1", 12, 1.8F);
        Car car2 = new Car("2", 21, 1.6F);
        Car car3 = new Car("3", 10, 1.4F);

        //вывод хэш-кодов
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
