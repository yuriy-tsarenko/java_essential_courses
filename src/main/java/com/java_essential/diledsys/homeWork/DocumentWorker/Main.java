package com.java_essential.diledsys.homeWork.DocumentWorker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DocumentWorker documentWorker;

        Scanner sc = new Scanner( System.in );
        System.out.println( "ключ продукта:" );
        String accessKey = sc.nextLine();

        if (accessKey.equals( "qw23" )) {
            System.out.println( "Pro version" );
            documentWorker = new ProDocumentWorker();
        } else if (accessKey.equals( "er54" )) {
            System.out.println( "Exp version" );
            documentWorker = new ExpertDocumentWorker();
        } else documentWorker = new DocumentWorker();

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();

    }
}
