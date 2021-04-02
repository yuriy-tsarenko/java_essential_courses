package com.java_essential.gradoboev.Lesson1GradoboevHomework.task2;

public class Content {

    public String content = "biography";

    public Content(String content) {
        this.content = content;
    }

    public Content() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    void show() {
        System.out.println(content);
    }

}
