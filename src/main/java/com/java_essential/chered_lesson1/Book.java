package com.java_essential.chered_lesson1;

public class Book {
    public static void main (String [] args)
    {
        Title title = new Title("Book");
        Author author = new Author("Author");
        Content content = new Content("Content");
        title.show();
        author.show();
        content.show();
    }
    public Book() {
        super();
    }
    protected void show() {}
}
