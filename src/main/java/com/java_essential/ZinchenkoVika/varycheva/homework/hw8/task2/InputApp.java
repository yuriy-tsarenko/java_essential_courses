package com.java_essential.varycheva.essential.homework.hw8.task2;

import java.util.Scanner;

public class InputApp {
    private final Scanner scanner = new Scanner(System.in);

    public Price inputPrice() {
        System.out.print("Введите название товара: ");
        String product = scanner.next();
        System.out.print("Введите название магазина: ");
        String shopName = scanner.next();
        System.out.print("Введите стоимость товара в гривнах: ");
        double priceUAH = scanner.nextDouble();

        return new Price(product, shopName, priceUAH);
    }

    public Products inputProducts(int size) {
        Products products = new Products();
        for (int i = 0; i < size; i++) {
            System.out.println("Введите продукт №" + (i + 1));
            products.addProduct(inputPrice());

        }
        return products;
    }

    public void printInputProducts(int size) {
        inputProducts(size).printProducts();
    }
}
