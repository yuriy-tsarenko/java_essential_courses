package Lesson2GradoboevHomework.task3;
//Задание 3
// Используя Intelij IDEA создать проект, пакет. Создать класс Машина с полями год(int), скорость(double),
// вес(int) цвет(String).
// Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я. Перегрузить конструкторы.
//Создать класс Main,в котором создать экземляры класса Машина с разными параметрами.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2000);
        Car car3 = new Car(2005,250,3000);
        Car car4 = new Car(2008,260,2500,"red");
        Car car5 = new Car(2011,280,2300,"white");

        System.out.println("car1: " + car1.toString());
        System.out.println("car2: " + car2.toString());
        System.out.println("car3: " + car3.toString());
        System.out.println("car4: " + car4.toString());
        System.out.println("car5: " + car5.toString());


    }
}
