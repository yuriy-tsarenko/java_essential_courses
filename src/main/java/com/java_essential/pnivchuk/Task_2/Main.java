package com.java_essential.pnivchuk.Task_2;
/*Описать класс с именем Price, содержащую следующие поля:  название товара;  название магазина, в котором продается товар;
 стоимость товара в гривнах. Написать программу, выполняющую следующие действия:  ввод с клавиатуры данных в массив, состоящий
 из двух элементов типа Price (записи должны быть упорядочены в алфавитном порядке по названиям магазинов);*/
import java.util.Scanner;

/*Описать класс с именем Price, содержащую следующие поля:  название товара;  название магазина, в котором продается товар;
 стоимость товара в гривнах. Написать программу, выполняющую следующие действия:  ввод с клавиатуры данных в массив, состоящий
 из двух элементов типа Price (записи должны быть упорядочены в алфавитном порядке по названиям магазинов);*/
public class Main {
    public static void main(String[] args) {
        Price[] arr = new Price[2];
        Scanner sc = new Scanner(System.in);
        String s;
        double d;

        //fill arr
        for (int i = 0; i < arr.length; i++) {
            Price price = new Price();
            System.out.println("Please, input name of goods! " + (i + 1));
            s = sc.nextLine();
            price.setGoodsName(s);
            System.out.println("Please, input name of shop! " + (i + 1));
            s = sc.nextLine();
            price.setShopName(s);
            Scanner scan = new Scanner(System.in);
            System.out.println("Please, input price of the goods! " + (i + 1));
            d = scan.nextDouble();
            price.setPrice(d);
            arr[i] = price;
        }


        Price[] sortedPrices = sortArrObj(arr);

        for (Price p : sortedPrices) {
            System.out.println(p.getShopName());
        }

    }

    public static Price[] sortArrObj(Price[] arr){
        boolean changeHasBeenOccurred = true;
        int count = 0;
        while (changeHasBeenOccurred) {
            changeHasBeenOccurred = false;
            for (int j = 0; j < arr.length - 1 - count; j++) {
                if (arr[j].getShopName().compareTo(arr[j + 1].getShopName()) > 0) {
                    Price p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                    changeHasBeenOccurred = true;
                }
            }
            count++;
        }
        return arr;
    }
}
