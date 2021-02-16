package com.java_essential.kopaiev.essential.homework.lesson1.task3;

public class Author {

    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void show()
    {
        if (authorName == null) {
            System.out.println("Book author is not set");
        } else {
            System.out.println("Author is " + authorName);
        }
    }
}
