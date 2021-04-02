package com.java_essential.tsarenko.lesson2.ex_007_constructors.from_constructors;

public class Main {
    public static void main(String[] args) {
        // пример создания объектов с разными параметрами
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(12);
        Animal animalWithTwoParameters = new Animal(14, 50);

        // выводим на экран наши объекты
        System.out.println("Age: " + animalDefault.getAge() + "; Height: " + animalDefault.getHeight());
        System.out.println("Age: " + animalWithOneParameter.getAge() + "; Height: " + animalWithOneParameter.getHeight());
        System.out.println("Age: " + animalWithTwoParameters.getAge() + "; Height: " + animalWithTwoParameters.getHeight());
    }
}