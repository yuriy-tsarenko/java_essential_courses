package com.java_essential.tsarenko.lesson5.ex_004_arrays.class_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // методы класса Arrays
        int[] arr = {2, 12, 3, 124, 55, 22};
        int[] arr2 = {56, 78, 23,};

        // Сортировка массива
        Arrays.sort(arr);

        // вывод массива(выводит место в памяти,
        // которое занимает массив)
        System.out.println(arr);

        // через метод toString выводим его содержимое
        System.out.println(Arrays.toString(arr));

        // поиск элемента в массиве
        System.out.println(Arrays.binarySearch(arr, 12));

        // сравнивает массивы
        System.out.println(Arrays.equals(arr, arr2));

        // вставить элемент в массив
        Arrays.fill(arr, 12);
        System.out.println(Arrays.toString(arr));
    }
}
