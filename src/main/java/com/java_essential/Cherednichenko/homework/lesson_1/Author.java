package com.java_essential.Cherednichenko.homework.lesson_1;

public class Author {

    private String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void show() {
        System.out.print(author+", ");
    }
}