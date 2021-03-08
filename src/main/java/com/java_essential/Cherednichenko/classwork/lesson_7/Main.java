package com.java_essential.Cherednichenko.classwork.lesson_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mark = 0;
        mark = mark + wrapper(new Class());
        mark = mark + wrapper(new Default());
        mark = mark + wrapper(new Private());
        mark = mark + wrapper(new Protected());
        mark = mark + wrapper(new Public());
        System.out.println("Mark " + mark);
    }

    public static Integer wrapper(Interface object) {
        int mark = 0;
        Scanner scanner = new Scanner(System.in);
        object.printA();
        object.printB();
        object.printC();
        object.printD();
        if (scanner.next().equals(object.getCorrectAnswer())) {
            mark = 1;
        }
        return mark;
    }
}