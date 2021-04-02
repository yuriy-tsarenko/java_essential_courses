package com.java_essential.ZinchenkoVika.varycheva.homework.hw3.task3;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
