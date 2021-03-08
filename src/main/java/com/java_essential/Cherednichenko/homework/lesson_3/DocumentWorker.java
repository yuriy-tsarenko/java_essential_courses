package com.java_essential.Cherednichenko.homework.lesson_3;

import java.util.Scanner;

public class DocumentWorker {
    public DocumentWorker() {
    }

    public void openDocument() {
        System.out.println("Документ открыт");
    }

    public void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    public void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }

    public static void main(String[] args) {
        DocumentWorker documentWorker;
        System.out.println("Input key: ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "pro":
                documentWorker = new ProDocumentWorker();
                break;
            case "expert":
                documentWorker = new ExpertDocumentWorker();
                break;
            case "":
                documentWorker = new DocumentWorker();
            default:
                System.out.println("Wrong key");
                documentWorker = new DocumentWorker();
                break;
        }
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }

}

