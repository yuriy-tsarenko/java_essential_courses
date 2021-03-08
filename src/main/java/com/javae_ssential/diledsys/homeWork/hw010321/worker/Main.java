package com.javae_ssential.diledsys.homeWork.hw010321.worker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String jobTitle = "";
        String yearJoining = "";
        String fullname = "";
        Worker[] workers = new Worker[5];
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Сотрудник №" + i + 1);
            System.out.print("ФИО: ");
            fullname = reader.nextLine();
            System.out.print("название занимаемой должности: ");
            jobTitle = reader.nextLine();
            while (true) {
                System.out.println("дата в формате дд-мм-гггг");
                System.out.println("год поступления на работу: ");
                yearJoining = reader.nextLine();
                try {
                    if (!cheackData(yearJoining)) {
                        throw new Exception("invalid date format");
                    } else break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            workers[i] = new Worker(fullname, jobTitle, yearJoining);
        }
        Arrays.sort(workers);
        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }
    }

    public static boolean cheackData(String data) {
        int d = 0, m = 0, y = 0;
        if (data.matches("\\d{2}-\\d{2}-\\d{4}")) {
            for (String ch : data.split("-")) {
                int digital = Integer.parseInt(ch);
                if (d == 0) {
                    d = digital;
                } else if (m == 0) {
                    m = digital;
                } else {
                    y = digital;
                }
            }
            if (d < 30 && d > 0 && m <= 12 && m > 0 && y > 1957 && y < 2021) return true;
        }
        return false;
    }
}
