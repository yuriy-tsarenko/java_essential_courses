package com.java_essential.varycheva.essential.homework.hw1.task2;

public class Book {

    private Author author;
    private Title title;
    private Content content;

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void show() {
        title.show();
        author.show();
        content.show();
    }
}
