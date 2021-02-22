package com.java_essential.kopaiev.essential.homework.lesson1.task3;

public class Title {
    private String titleName;

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public void show() {
        if (titleName == null) {
            System.out.println("Book title is not set");
        } else {
            System.out.println("Book title is " + titleName);
        }
    }
}
