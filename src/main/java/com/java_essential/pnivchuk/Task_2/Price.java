package com.java_essential.pnivchuk.Task_2;
/*Описать класс с именем Price, содержащую следующие поля:  название товара;  название магазина, в котором продается товар;
 стоимость товара в гривнах. Написать программу, выполняющую следующие действия:  ввод с клавиатуры данных в массив, состоящий
 из двух элементов типа Price (записи должны быть упорядочены в алфавитном порядке по названиям магазинов);*/
public class Price {
    private String goodsName;
    private String shopName;
    private double price;


    public String getShopName() {
        return shopName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
