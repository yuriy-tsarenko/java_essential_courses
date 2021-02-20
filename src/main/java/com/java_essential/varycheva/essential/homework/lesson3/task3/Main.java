package com.java_essential.varycheva.essential.homework.lesson3.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.equals("pro")) {
            DocumentWorker document = new ProDocumentWorker();
            document.openDocument();
            document.editDocument();
            document.saveDocument();
        } else if (input.equals("exp")) {
            DocumentWorker document = new ExpertDocumentWorker();
            document.openDocument();
            document.editDocument();
            document.saveDocument();
        } else {
            DocumentWorker document = new DocumentWorker();
            document.openDocument();
            document.editDocument();
            document.saveDocument();
        }
    }
}
