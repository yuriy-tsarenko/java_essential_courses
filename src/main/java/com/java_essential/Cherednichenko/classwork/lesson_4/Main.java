package com.java_essential.Cherednichenko.classwork.lesson_4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input format file");
        Scanner scanner = new Scanner(System.in);
        String strscaner = scanner.next().toUpperCase(Locale.ROOT);
        switch (strscaner) {
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
                System.out.println("Wrong !!! Please try again");
                break;


        }
    }
}
