package com.java_essential.kopaiev.essential.homework.lesson4.task3;

public class Main {
    public static void main(String[] args) {
        /*
    Задание 3
    Требуется: Создайте 2 интерфейса Playable и Recordable. В каждом из интерфейсов создайте по 3 метода
    void play() / void pause() / void stop() и void record() / void pause() / void stop() соответственно.
    Создайте производный класс Player от базовых интерфейсов Playable и Recordable. Написать программу,
    которая выполняет проигрывание и запись.
        */
        MenuWorker menu = new MenuWorker();
        menu.start();
    }
}
