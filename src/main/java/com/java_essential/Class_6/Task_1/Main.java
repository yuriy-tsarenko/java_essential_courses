package com.java_essential.Class_6.Task_1;

/*Создать класс Vehicle с методом print.
В классе Vehicle, создайте внутренний класс Wheel и Door, которые также должны содержать метод print.
Создайте экземпляры классов Wheel и Door.
 */
class Vehicle {
    public void print() {
        System.out.println("print from class Vehicle");
    }


    public class Wheel {

        void print() {
            System.out.println("print from class Wheel");
        }
    }

    public class Door {

        void print() {
            System.out.println("print from class Door");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle.Wheel vw = new Vehicle().new Wheel();
        vw.print();
        Vehicle.Door vd = new Vehicle().new Door();
        vd.print();
    }

}
