package com.java_essential.varycheva.essential.classwork.lesson4.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        switch (command){
            case "doc":
                AbstractHandler doc = new DOCHandler();
                doc.create();
                doc.open();
                doc.change();
                doc.save();
                break;
            case "txt":
                AbstractHandler txt = new TXTHandler();
                txt.create();
                txt.open();
                txt.change();
                txt.save();
                break;
            case "xml":
                AbstractHandler xml = new XMLHandler();
                xml.create();
                xml.open();
                xml.change();
                xml.save();
                break;
        }
    }
}
