package Lesson1GradoboevHomework.task2;

public class Title {
    public String title = "My life, my achievements";

    public Title() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public Title(String title) {
        this.title = title;
    }

    void show() {
        System.out.println(title);

    }
}
