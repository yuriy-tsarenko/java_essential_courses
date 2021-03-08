package com.java_essential.varycheva.essential.homework.hw6.task1;

/*
Создайте проект, используя IntelliJ IDEA.
Требуется: Создать класс Vehicle с методом print.
В классе Vehicle, создайте внутренний класс Wheel и Door,
которые также должны содержать метод print.
Создайте экземпляры классов Wheel и Door.
 */
public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.print();
        Vehicle.Wheel wheel = new Vehicle.Wheel();
        Vehicle.Door door = new Vehicle.Door();
        wheel.print();
        door.print();
    }
}
