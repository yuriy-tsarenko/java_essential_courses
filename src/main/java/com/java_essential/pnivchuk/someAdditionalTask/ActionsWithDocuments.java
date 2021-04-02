package com.java_essential.pnivchuk.someAdditionalTask;
/*Создайте класс AbstractHandler. В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler. Написать программу,
которая будет выполнять определение документа и для каждого формата должны быть методы открытия, создания, редактирования,
сохранения определенного формата документа.*/
public enum ActionsWithDocuments {
    OPEN, CREATE, CHANGE, SAVE;
    public static ActionsWithDocuments getAction(String choice) throws IllegalStateException {
        for (int i = 0; i < values().length; i++) {
            ActionsWithDocuments value = values()[i];
            if (choice.equals(value.name())) {
                return value;
            }
        }
        throw new IllegalStateException("Unexpected value: " + choice);
    }
}
