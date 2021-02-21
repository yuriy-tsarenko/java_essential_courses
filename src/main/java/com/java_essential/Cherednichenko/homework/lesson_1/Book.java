package com.java_essential.Cherednichenko.homework.lesson_1;

public class Book {
    private final Title title;
    private final Author author;
    private final Content content;

    public Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book(new Title("Title_1"), new Author("Author_1"), new Content("Content_1"));
        books[1] = new Book(new Title("Title_2"), new Author("Author_2"), new Content("Content_2"));
        books[2] = new Book(new Title("Title_3"), new Author("Author_3"), new Content("Content_3"));
        for(Book book:books){
            book.show();
        }
    }

    protected void show() {
        title.show();
        author.show();
        content.show();
    }
}
