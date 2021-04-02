package com.java_essential.Cherednichenko.homework.lesson_8.task_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Price[] prices = new Price[2];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = new Price();
            prices[i].setNameOfGood(getScanner("NameOfGood"));
            prices[i].setNameOfStorage(getScanner("NameOfStorage"));
            try {
                prices[i].setPriceOfGood(Double.parseDouble(getScanner("Price")));
            } catch (Exception e) {
                System.out.println("Wrong price");
            }
        }
        prices = comparatorForPrices(prices);
        for (Price p : prices) {
            System.out.println(p.getNameOfStorage());
        }
    }

    public static String getScanner(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input " + text);
        return scanner.next();
    }

    public static Price[] comparatorForPrices(Price[] prices) {
        Arrays.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.getNameOfStorage().compareTo(o2.getNameOfStorage());
            }
        });
        return prices;
    }
}
