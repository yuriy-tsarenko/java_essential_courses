package com.java_essential.kopaiev.essential.homework.lesson1.task3;

public class Content {
    private String contentName;

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public void show()
    {
        if (contentName == null) {
            System.out.println("Book content is not set");
        } else {
            System.out.println("Content: " + contentName);
        }
    }
}
