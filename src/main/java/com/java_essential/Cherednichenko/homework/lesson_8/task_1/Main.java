package com.java_essential.Cherednichenko.homework.lesson_8.task_1;

import java.util.*;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<>();
        int thisYear = 2021;
        int year;
        String name;
        String nameOfPosition;
        for (int i = 0; i < 5; i++) {
            name = getScanner(" FullName of Worker");
            nameOfPosition = getScanner(" NameOfPosition of Worker");
            try {
                year = Integer.parseInt(getScanner(" Year of Worker"));
                if (year > thisYear) {
                    throw new Exception();
                }
                workerList.add(new Worker(name, nameOfPosition, year));
            } catch (Exception e) {
                log.info(e);
                System.out.println("Wrong year: " + name);
            }
        }
        workerList = comparatorForWorker(workerList);
        System.out.println("Result: ");
        for (Worker worker : workerList) {
            System.out.println(worker.getFullName());
        }
    }

    public static String getScanner(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input " + text);
        return scanner.next();
    }

    public static List<Worker> comparatorForWorker(List<Worker> workerList) {
        workerList.sort(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        return workerList;
    }
}
