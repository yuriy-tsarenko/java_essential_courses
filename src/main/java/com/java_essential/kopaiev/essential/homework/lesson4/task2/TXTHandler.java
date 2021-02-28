package com.java_essential.kopaiev.essential.homework.lesson4.task2;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("TXT Document is opened");
    }

    @Override
    void create() {
        System.out.println("TXT Document is created");
    }

    @Override
    void change() {
        System.out.println("TXT Document is changed");
    }

    @Override
    void save() {
        System.out.println("TXT Document is saved");
    }
}
