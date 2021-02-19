package com.java_essential.kopaiev.essential.classwork.lesson4.task2;

public class XMLHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("XML Document is opened");
    }

    @Override
    void create() {
        System.out.println("XML Document is created");
    }

    @Override
    void change() {
        System.out.println("XML Document is changed");
    }

    @Override
    void save() {
        System.out.println("XML Document is saved");
    }
}
