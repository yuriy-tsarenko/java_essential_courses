package com.java_essential.kopaiev.essential.homework.lesson4.task2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Задание 2
        Требуется: Создайте класс AbstractHandler. В теле класса создать методы void open(), void create(),
        void change(), void save(). Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса
        AbstractHandler. Написать программу, которая будет выполнять определение документа и для каждого формата должны
        быть методы открытия, создания, редактирования, сохранения определенного формата документа.
        */

        Scanner reader = new Scanner(System.in);
        System.out.println("Please choose file format");
        String chose = reader.next().toUpperCase(Locale.ROOT);

        switch (chose) {
            case "TXT":
                TXTHandler txt = new TXTHandler();
                txt.create();
                txt.open();
                txt.save();
                txt.change();
                break;
            case "XML":
                XMLHandler xml = new XMLHandler();
                xml.create();
                xml.open();
                xml.save();
                xml.change();
                break;
            case "DOC":
                DOCHandler doc = new DOCHandler();
                doc.create();
                doc.open();
                doc.save();
                doc.change();
                break;

            default:
                System.out.println("Wrong Input. Please try again");
                break;
        }

    }
}
