package com.java_essential.Cherednichenko.homework.lesson_1;

public class Content extends Book{
    String content;
    public Content(String content)
    {
        super();
        this.content=content;
    }
    @Override
    public void show()
    {
        System.out.println(content);
    }
}
