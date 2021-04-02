package com.java_essential.pnivchuk.Task_1;

import java.util.Scanner;

/*Описать класс с именем Worker, содержащую следующие поля: фамилия и инициалы работника;  название занимаемой должности;
год поступления на работу. Написать программу, выполняющую следующие действия:  ввод с клавиатуры данных в массив,
состоящий из пяти элементов типа Worker (записи должны быть упорядочены по алфавиту);  если значение года введено не в
соответствующем формате выдает исключение.  вывод на экран фамилии работника, стаж работы которого превышает введенное значение.*/
public class Main {
    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        String name;
        String position;
        int year;
        int yearCompanyHasBeenLaunched = 1990;
        int currentYear = 2021;
        Scanner sc = new Scanner(System.in);

        //fill array of workers
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Please, input name of worker " + (i + 1));
            name = sc.nextLine();
            System.out.println("Please, input position of worker " + (i + 1));
            position = sc.nextLine();
            System.out.println("Please, input year of entrance of worker " + (i + 1));
            Scanner scan = new Scanner(System.in);
            year = scan.nextInt();
            try {
                if (year > currentYear || year < yearCompanyHasBeenLaunched) {
                    throw new Exception();
                }
                Worker worker = new Worker(name, position, year);
                workers[i] = worker;
            } catch (Exception e) {
                System.out.println("Wrong year for worker " + name);
                Worker worker = new Worker("wrong year for " + name , "wrong year for " + name, 0);
                workers[i] = worker;
            }
        }

        //sort array of workers by name
        boolean hasBeenChanged = true;
        int count = 0;
        while (hasBeenChanged) {
            hasBeenChanged = false;
            for (int j = 0; j < workers.length - 1 - count; j++) {
                if (workers[j].getName().compareTo(workers[j + 1].getName()) > 0) {
                    Worker w = workers[j];
                    workers[j] = workers[j + 1];
                    workers[j + 1] = w;
                    hasBeenChanged = true;
                }
            }
            count++;
        }


        for (Worker w : workers) {
            System.out.println(w.getName());
        }

    }
}
