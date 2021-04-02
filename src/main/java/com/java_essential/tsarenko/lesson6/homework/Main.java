package com.java_essential.tsarenko.lesson6.homework;

// Задание 2
//         Создайте проект, используя IntelliJ IDEA. Требуется: Создать класс Vehicle с методом print.
//         В классе Vehicle,создайте внутренний класс Wheel и Door, которые также должны содержать метод print.
//         Создайте экземпляры классов Wheel и Door.
public class Main {
    public static void main(String[] args) {
        Vehicle.Door door = new Vehicle().new Door();
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        door.print();
        wheel.print();
        Vehicle.Wheel instance = new Vehicle().new Door();
        instance.print();
    }
}
