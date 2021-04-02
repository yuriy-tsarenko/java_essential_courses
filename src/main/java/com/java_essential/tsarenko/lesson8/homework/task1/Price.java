package com.java_essential.tsarenko.lesson8.homework.task1;


public class Price {
    // Поля клаcса Price
    String name;
    String shop_name;
    double price;

    // Конструктор с параметрами
    public Price(String name, String shop_name, double price) {
        this.name = name;
        this.shop_name = shop_name;
        this.price = price;
    }

    // Перегрузка метода toString()
    @Override
    public String toString() {
        return "NameOfProduct = " + this.name + "; Shop_name = " + this.shop_name + "; Price = " + this.price;
    }
}
