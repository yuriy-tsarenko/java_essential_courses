package com.java_essential.tsarenko.lesson2.ex_006_constructors.overload;

public class Main {
    public static void main(String[] args) {
        // создание обьектов с разными параметрами
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(22);
        Animal animalWithTwoParameters = new Animal(23, 61);

        // вывод параметров объеков
        System.out.println("Age: " + animalDefault.getAge() + "; Height: " + animalDefault.getHeight());
        System.out.println("Age: " + animalWithOneParameter.getAge() + "; Height: " + animalWithOneParameter.getHeight());
        System.out.println("Age: " + animalWithTwoParameters.getAge() + "; Height: " + animalWithTwoParameters.getHeight());
    }
}