package com.java_essential.Cherednichenko.homework.lesson_4;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("DOC file opened");
    }

    @Override
    void create() {
        System.out.println("DOC file created");
    }

    @Override
    void change() {
        System.out.println("DOC file changed");
    }

    @Override
    void save() {
        System.out.println("DOC file saved");
    }
}
