package com.java_essential.kopaiev.essential.homework.lesson1.task3;

import java.awt.desktop.SystemSleepEvent;

public class Book {
    public static void main(String[] args) {

        // Create class examples
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        // Set information
        author.setAuthorName("Richard Morgan");
        title.setTitleName("Woken Furies");
        content.setContentName("Woken Furies is a science fiction novel by British writer Richard Morgan. " +
                "It is the third novel featuring the anti-hero Takeshi Kovacs and is the sequel to Broken Angels.");

        //Show info about book
        author.show();
        title.show();
        content.show();
    }
}
