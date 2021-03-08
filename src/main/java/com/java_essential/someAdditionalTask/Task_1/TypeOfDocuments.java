package com.java_essential.someAdditionalTask.Task_1;

enum TypeOfDocuments {
    TXT, XML, DOC;
    public static String getChoice(String choice) throws IllegalStateException {
        for (int i = 0; i < values().length; i++) {
            TypeOfDocuments value = values()[i];
            if (choice.equals(value.name())) {
                return choice;
            }
        }
        throw new IllegalStateException("Unexpected value: " + choice);
    }
}
