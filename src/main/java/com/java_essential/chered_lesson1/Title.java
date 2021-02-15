package com.java_essential.chered_lesson1;

public class Title extends Book{
    String title;
    public Title(String title)
    {
        super();
        this.title=title;
    }
    @Override
    public void show()
    {
        System.out.println(title);
    }
}