package com.java_essential.diledsys.homeWork.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private static List<Book> books;
    private final Title title;
    private final Author author;
    private final Content content;

    Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;

    }

    public static void main(String[] args) {

        books = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Название книги: ");
            Title title = new Title();
            title.title = sc.nextLine();
            Author author = new Author();
            System.out.println("Автор: ");
            author.author = sc.nextLine();
            System.out.println("Содержание: ");
            Content content = new Content();
            content.content = sc.nextLine();
            books.add(new Book(title, author, content));
            System.out.println("продолжить ввод? y or n");
        } while (!sc.nextLine().equals("n"));
        Book.show();
    }

    public static void show() {
        for (Object book : books) {
            System.out.println(book.toString());
        }
    }

    @Override
    public String toString() {
        return " Книга{ " + "\n" +
                " Название: " + title.title + "\n" +
                " Автор: " + author.author + "\n" +
                " Описание: " + content.content +
                '}';
    }
}
