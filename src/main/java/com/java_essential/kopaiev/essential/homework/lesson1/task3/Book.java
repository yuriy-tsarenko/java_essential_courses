package com.java_essential.kopaiev.essential.homework.lesson1.task3;

import java.awt.desktop.SystemSleepEvent;
import java.io.Reader;
import java.util.Scanner;

public class Book {

    Author author = new Author();
    Title title = new Title();
    Content content = new Content();

    public Book(Author author, Title title, Content content) {
        this.author = author;
        this.title = title;
        this.content = content;
        Scanner reader = new Scanner(System.in);

        System.out.println("Hi, set Author's name");
        author.setAuthorName(reader.next());
        System.out.println("Hi, set Title's name");
        title.setTitleName(reader.next());
        System.out.println("Hi, set description");
        content.setContentName(reader.next());
    }

    public static void main(String[] args) {

        // Create class examples
        Book book = new Book(new Author(), new Title(), new Content());

        //Show info about book
        show(book.author, book.title, book.content);
    }

    private static void show(Author author, Title title, Content content) {
        author.show();
        title.show();
        content.show();
    }
}
