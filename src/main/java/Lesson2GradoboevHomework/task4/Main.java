package Lesson2GradoboevHomework.task4;
//Задание 4
// Используя Intelij IDEA создать проект, пакет. Создать класс Машина с полями год(int), скорость(double),
// вес(int) цвет(String).
// Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
// Перегрузить конструкторы вызывая конструктор из конструктора.
// Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2011,280,2500,"red");
        Car car3 = new Car(2012,300,3000,"blue");
        Car car4 = new Car(2015,250,1500,"yellow");
        Car car5 = new Car(2017,255,1800,"green");

        System.out.println("Car 1 = " + car1.toString());
        System.out.println("Car 2 = " + car2.toString());
        System.out.println("Car 3 = " + car3.toString());
        System.out.println("Car 4 = " + car4.toString());
        System.out.println("Car 5 = " + car5.toString());



    }
}
