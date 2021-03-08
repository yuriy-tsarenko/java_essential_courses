package com.java_essential.ready_tasks.lesson8.homework.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создаем массив Price
        Price[] prices = new Price[2];

        // Создаем объект потока вывода BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // loop
        for (int i = 0; i < prices.length; i++) {
            // Вводим данные пока массив не заполнится
            System.out.println("NameOfProduct = ");
            String name = reader.readLine();
            System.out.println("Shop_name = ");
            String shop_name = reader.readLine();
            System.out.println("Price = ");
            double price = Double.parseDouble(reader.readLine());

            //Добавление через конструктор
            prices[i] = new Price(name, shop_name, price);
        }
        // Вывод на экран
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i].toString());
        }

        // Вводим значение по условию
        System.out.println("Input shop_name:");
        String shop_name = reader.readLine();

        for (int i = 0; i < prices.length; i++) {
            String name = prices[i].shop_name;

            // По выполнению условия вывод на экран
            if (name.equals(shop_name)) {
                System.out.println(prices[i].toString());
            } else {
                throw new Exception();
            }
        }
    }
}
