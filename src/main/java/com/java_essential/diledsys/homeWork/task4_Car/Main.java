package com.java_essential.diledsys.homeWork.task4_Car;


public class Main {

    public static void main(String[] args) {

        Car mazda = new Car(2017);
        Car renault = new Car(2014, 150.0);
        Car mersedes = new Car(2020, 220, 2000);
        Car kya = new Car(2017, 180, 1700, "green");
        //Car zm =new Car("red",180,200,2000);
        Car zm = new Car("red",200,1200,2019);//вызов конструктора из конструктора
    }
}
