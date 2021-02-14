package com.java_essential.lesson_1;

public class Author extends Book{
    String author;
    public Author(String author)
    {
        super();
        this.author=author;
    }
    @Override
    public void show()
    {
        System.out.println(author);
    }
}