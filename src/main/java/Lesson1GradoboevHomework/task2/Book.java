package Lesson1GradoboevHomework.task2;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        title.setTitle("My life, my achievements");
        author.setAuthor("Henry Ford");
        content.setContent("biography");

        System.out.println("Book is: ");

        title.show();
        author.show();
        content.show();




    }
}
