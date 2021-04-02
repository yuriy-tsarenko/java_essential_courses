package com.java_essential.tsarenko.lesson8.examples.ex007_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("Попытка деления на ноль.");
            System.out.println("a / (2 - n) = " + (a / (2 - n)));
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Блок finally.");
        }

        System.out.println("Конец кода.");
    }
}
