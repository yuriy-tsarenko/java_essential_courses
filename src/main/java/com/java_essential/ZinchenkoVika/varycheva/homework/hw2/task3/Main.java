package com.java_essential.ZinchenkoVika.varycheva.homework.hw2.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Car().toString());
        System.out.println(new Car(2003).toString());
        System.out.println(new Car(2003, 200).toString());
        System.out.println(new Car(2003, 200, 1670).toString());
        System.out.println(new Car(2003, 200, 1670, "blue").toString());
    }
}
