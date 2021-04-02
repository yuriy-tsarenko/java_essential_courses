package com.java_essential.tsarenko.lesson2.ex_005_constructors.private_constructor;

public class Main {
    public static void main(String[] args) {
//         Компилятор нам не даст возможности создать объект с приватным консруктором
         Animal animal = new Animal(5);
         Animal animal1 = new Animal();
    }
}