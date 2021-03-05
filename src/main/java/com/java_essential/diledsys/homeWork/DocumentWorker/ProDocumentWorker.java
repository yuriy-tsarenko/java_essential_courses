package com.java_essential.diledsys.homeWork.DocumentWorker;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        System.out.println( "Документ отредактирован" );
    }

    @Override
    public void saveDocument() {
        System.out.println( "Документ сохранен в старом формате," +
                " сохранение в остальных форматах доступно в версии Эксперт" );
    }
}
