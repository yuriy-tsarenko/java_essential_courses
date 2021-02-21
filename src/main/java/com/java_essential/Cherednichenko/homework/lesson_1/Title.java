package com.java_essential.Cherednichenko.homework.lesson_1;

public class Title {
    private String title;

    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void show() {
        System.out.print(title+", ");
    }
}