package Lesson1GradoboevHomework.task2;

public class Author {

    public String author = "Henry Ford";

    public Author() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Author(String author) {
        this.author = author;
    }



    void show() {
        System.out.println(author);
    }
}
