package com.java_essential.tsarenko.lesson8.examples.with_logger;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleLogger logger = new SimpleLogger();
        System.out.println("Which type of document would you like to work with?" +
                " Available option DOC or XML or TXT. Input one of them.");
        String choice = sc.nextLine();
        try {
            switch (TypeOfDocuments.getChoice(choice)) {
                case TXT:
                    System.out.println("TXT");
                    break;
                case XML:
                    System.out.println("XML");
                    break;
                case DOC:
                    System.out.println("DOC");
                    break;
            }
        } catch (IllegalStateException e) {
            logger.logInfo(e.toString());
        }
    }
}

