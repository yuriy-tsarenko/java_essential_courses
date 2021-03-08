package com.javae_ssential.diledsys.homeWork.hw010321.price;

//Product Name; name of shop
public class Price implements Comparable<Price> {
    String productName;
    String nameShop;
    int price;

    public Price(String productName, String nameShop, int price) {
        this.productName = productName;
        this.nameShop = nameShop;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getNameShop() {
        return nameShop;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Price p) {
        return nameShop.compareTo(p.nameShop);
    }

    @Override
    public String toString() {
        return "Price" + "\n" +
                "productName:" + productName + "\n" +
                "nameShop: " + nameShop + "\n" +
                "price: " + price;
    }
}
