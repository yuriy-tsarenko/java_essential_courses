package com.java_essential.chered_lesson1;

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