package com.java_essential.tsarenko.lesson8.homework.task;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {
    // Метод для валидности даты
    public static boolean isThisDateValid(String dateToValidate, String dateFromat) {
        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
        sdf.setLenient(false);

        try {
            // if not valid, it will throw ParseException
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ParseException {
        // Создаем массив Worker
        Worker[] worker = new Worker[4];

        // Создаем обьект потока вывода BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // loop
        for (int i = 0; i < worker.length; i++) {
            String fio = "";
            String post = "";
            String year = "";
            //Вводим данные пока масив не заполнится
            System.out.println("ФИО = ");
            fio = br.readLine();
            System.out.println("Должность = ");
            post = br.readLine();
            System.out.println("Год = ");
            year = (br.readLine());

            isThisDateValid(year, "yyyy");

            // Добавление через конструктор
            worker[i] = new Worker(fio, post, year);
        }
        // Вывод на экран
        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i].toString());
        }

        // Вводим значение по условию
        System.out.println("Input value:");
        int value = Integer.parseInt(br.readLine());
        // Нынешний год что б узнать стаж работника
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = 0; i < worker.length; i++) {
            String year = worker[i].year;
            // Узнаем стаж
            int staj = yearNow - Integer.parseInt(year);
            // По выполнению условия вывод на экран
            if (staj > value) {
                System.out.println(worker[i].toString());
            }
        }
    }
}
