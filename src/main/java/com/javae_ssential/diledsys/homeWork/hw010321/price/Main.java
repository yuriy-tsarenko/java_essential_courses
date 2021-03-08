package com.javae_ssential.diledsys.homeWork.hw010321.price;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Price[] prices = new Price[2];
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < prices.length; i++) {
            System.out.print("product Name: ");
            String productName = reader.nextLine();
            System.out.print("shop Name: ");
            String shopName = reader.nextLine();
            System.out.print("price: ");
            int pricesis = Integer.parseInt(reader.nextLine());
            prices[i] = new Price(shopName, productName, pricesis);
        }
        Arrays.sort(prices);
        for (Price price : prices) {
            System.out.println(price.toString());
        }
    }
}
