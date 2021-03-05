package com.java_essential.ready_tasks.lesson8.examples.ex002_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("Мое Исключение", new RuntimeException());
        try {
            throw ex;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
