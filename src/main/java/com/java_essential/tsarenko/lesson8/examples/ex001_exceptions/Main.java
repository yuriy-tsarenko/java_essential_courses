package com.java_essential.tsarenko.lesson8.examples.ex001_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            // Попытка деления на ноль.
            a = a / (0);

            System.out.println("a = " + a);
        } catch (ArithmeticException e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}
