package com.java_essential.kopaiev.essential.classwork.lesson4.task2;

public class DOCHandler  extends AbstractHandler {
    @Override
    void open() {
        System.out.println("DOC Document is opened");
    }

    @Override
    void create() {
        System.out.println("DOC Document is created");
    }

    @Override
    void change() {
        System.out.println("DOC Document is changed");
    }

    @Override
    void save() {
        System.out.println("DOC Document is saved");
    }
}
