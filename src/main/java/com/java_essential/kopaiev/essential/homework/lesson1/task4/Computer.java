package com.java_essential.kopaiev.essential.homework.lesson1.task4;

public class Computer {
    public static void main(String[] args) {

        Object[] computers = new Object[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }
    }
}
