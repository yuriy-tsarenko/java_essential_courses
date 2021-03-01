package com.java_essential.varycheva.essential.classwork.lesson4.task1;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("TXT is opened");
    }

    @Override
    public void create() {
        System.out.println("TXT is created");
    }

    @Override
    public void change() {
        System.out.println("TXT is changed");
    }

    @Override
    public void save() {
        System.out.println("TXT is saved");
    }
}
