package com.java_essential.ZinchenkoVika.varycheva.classwork.lesson4.task1;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("DOC is opened");
    }

    @Override
    public void create() {
        System.out.println("DOC is created");
    }

    @Override
    public void change() {
        System.out.println("DOC is changed");
    }

    @Override
    public void save() {
        System.out.println("DOC is saved");
    }
}
