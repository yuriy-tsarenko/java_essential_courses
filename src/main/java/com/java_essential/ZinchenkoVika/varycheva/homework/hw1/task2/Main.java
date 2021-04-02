package com.java_essential.ZinchenkoVika.varycheva.homework.hw1.task2;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor(new Author("Jane Austen"));
        book.setTitle(new Title("Pride and Prejudice"));
        book.setContent(new Content("Content"));
        book.show();
    }
}
