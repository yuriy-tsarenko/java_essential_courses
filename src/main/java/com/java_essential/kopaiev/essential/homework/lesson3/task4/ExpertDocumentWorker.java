package com.java_essential.kopaiev.essential.homework.lesson3.task4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        super.editDocument();
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
