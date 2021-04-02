package com.java_essential.tsarenko.lesson8.examples.with_logger;

enum TypeOfDocuments {
    TXT, XML, DOC;

    public static TypeOfDocuments getChoice(String choice) throws IllegalStateException {
        for (int i = 0; i < values().length; i++) {
            TypeOfDocuments value = values()[i];
            if (choice.equals(value.name())) {
                return value;
            }
        }
        throw new IllegalStateException("Unexpected value: " + choice);
    }
}
