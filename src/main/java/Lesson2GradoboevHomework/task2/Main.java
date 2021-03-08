package Lesson2GradoboevHomework.task2;
//Задание 2
      //  Используя Intelij IDEA создать проект, пакет. Создать класс Машина с полями год(int),
     //   цвет(String). Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
     //   Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2019,"black");

        System.out.println(car1.year + " " + car1.color);
        System.out.println(car2.year + " " + car2.color);
        System.out.println(car3.year + " " + car3.color);
    }
}
