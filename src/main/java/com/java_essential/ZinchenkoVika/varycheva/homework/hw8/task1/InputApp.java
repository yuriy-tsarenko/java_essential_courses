package com.java_essential.varycheva.essential.homework.hw8.task1;

import java.util.Scanner;

public class InputApp {

    private final Scanner scanner = new Scanner(System.in);

    public Workers inputWorkers() {
        Workers workers = new Workers();
        for (int i = 1; i < 6; i++) {
            System.out.println("Worker #" + i);
            Worker worker = inputWorker();
            workers.addWorker(worker);
        }
        return workers;
    }

    public Worker inputWorker() {
        System.out.print("Введите фамилию: ");
        String lastName = inputStringValue();
        System.out.print("Введите инициалы: ");
        String initials = inputStringValue();
        System.out.print("Введите название занимаемой должности: ");
        String position = inputStringValue();
        System.out.print("Введите год поступления на работу: ");
        int year = inputYear();
        return new Worker(lastName, initials, position, year);
    }

    public int inputYearSearchValue() {
        System.out.print("Введите год для поиска сотрудника: ");
        return inputYear();
    }

    private String inputStringValue() {
        while (true) {
            try {
                return scanner.next();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Значение неправильное!");
                scanner.nextLine();
            }
        }
    }

    private int inputYear() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Значение неправильное!");
                scanner.nextLine();
            }
        }
    }
}
