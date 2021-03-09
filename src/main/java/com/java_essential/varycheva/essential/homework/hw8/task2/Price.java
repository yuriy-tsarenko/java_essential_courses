package com.java_essential.varycheva.essential.homework.hw8.task2;

public class Price implements Comparable<Price>{

    private String productName;
    private String shopName;
    private double uahPrice;

    public Price(String productName, String shopName, double uahPrice) {
        this.productName = productName;
        this.shopName = shopName;
        this.uahPrice = uahPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getShopName() {
        return shopName;
    }

    public double getUahPrice() {
        return uahPrice;
    }

    @Override
    public int compareTo(Price o) {
        return this.shopName.compareTo(o.shopName);
    }

    @Override
    public String toString() {
        return "Price{" +
                "productName='" + productName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", uahPrice=" + uahPrice +
                '}';
    }
}
