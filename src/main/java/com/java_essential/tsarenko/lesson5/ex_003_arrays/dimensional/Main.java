package com.java_essential.tsarenko.lesson5.ex_003_arrays.dimensional;

public class Main {
    public static void main(String[] args) {
        // объявление массива массивов
        int[][] arr = {
                {10, 15},
                {31, 44, 99, 56},
                {65, 12, 42},
                {}
        };

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i].length);
            }
        }
    }
}
