package com.java_essential.ZinchenkoVika.varycheva.classwork.lesson4.task1;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("XML is opened");
    }

    @Override
    public void create() {
        System.out.println("XML is created");
    }

    @Override
    public void change() {
        System.out.println("XML is changed");
    }

    @Override
    public void save() {
        System.out.println("XML is saved");
    }
}
