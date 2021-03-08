package com.java_essential.someAdditionalTask.Task_1;

import java.util.Scanner;

/*Создайте класс AbstractHandler. В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler. Написать программу,
которая будет выполнять определение документа и для каждого формата должны быть методы открытия, создания, редактирования,
сохранения определенного формата документа.*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleLogger logger = new SimpleLogger();
        System.out.println("Which type of document would you like to work with? Available option DOC, XML or TXT. Input one of them.");
        String choice = sc.nextLine();
        try {
            AbstractHandler doc = createDoc(choice);
            doAction(doc);
        } catch (IllegalStateException e) {
            logger.logInfo(e.toString());
            System.out.println(e.toString() + ";\nFor more information go into log file \n" + logger.getFilePath());
        }
    }

    public static AbstractHandler createDoc(String choice) throws IllegalStateException {
        if (TypeOfDocuments.getChoice(choice).equals("TXT")) {
            return new TXTHandler();
        } else if (TypeOfDocuments.getChoice(choice).equals("XML")) {
            return new XMLHandler();
        } else if (TypeOfDocuments.getChoice(choice).equals("DOC")) {
            return new DOCHandler();
        }else{ throw new IllegalStateException();}
    }

    public static void doAction(AbstractHandler doc) throws IllegalStateException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input action you would like to do with the document. Available action is OPEN, CREATE, CHANGE or SAVE. For stopping work input 'exit'!");
        String action;
        while (true) {
            action = sc.nextLine();
            if (action.equals("exit")) {
                break;
            }
            switch (ActionsWithDocuments.getAction(action)) {
                case OPEN:
                    doc.open();
                    break;
                case CREATE:
                    doc.create();
                    break;
                case CHANGE:
                    doc.change();
                    break;
                case SAVE:
                    doc.save();
                    break;
                default: throw new IllegalStateException();
            }
        }
    }
}
