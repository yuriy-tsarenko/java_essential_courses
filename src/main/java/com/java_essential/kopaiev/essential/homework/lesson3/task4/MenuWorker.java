package com.java_essential.kopaiev.essential.homework.lesson3.task4;

import java.util.Scanner;

public class MenuWorker {

    public MenuWorker(String version) {
        DocumentWorker worker = new DocumentWorker();

        switch (version) {
            case "pro":
                worker = new ProDocumentWorker();
                break;
            case "expert":
                worker = new ExpertDocumentWorker();
        }

        String hint = "Enter \"1\", \"2\", \"3\" or \"4\" for exit...";

        System.out.println("Your Version is : " + version);
        System.out.println("Enter one of the following commands:");
        System.out.println("1 - Open Document..");
        System.out.println("2 - Edit Document..");
        System.out.println("3 - Save Document..");
        System.out.println("4 - Leave..");

        Scanner scanChoice = new Scanner(System.in);
        System.out.println();
        System.out.println(hint);
        int choiceEntry = scanChoice.nextInt();

        while (choiceEntry != 4) {
            if (choiceEntry == 0) {
                System.out.println(hint);
                choiceEntry = scanChoice.nextInt();
            } else if (choiceEntry == 1) {
                worker.openDocument();
                choiceEntry = 0;
            } else if (choiceEntry == 2) {
                worker.editDocument();
                choiceEntry = 0;
            } else if (choiceEntry == 3) {
                worker.saveDocument();
                choiceEntry = 0;
            } else {
                System.out.println("Wrong input");
                choiceEntry = 0;
            }
        }
        System.out.println("Goodbye");
    }
}
