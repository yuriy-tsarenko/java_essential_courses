package com.java_essential.varycheva.essential.homework.hw8.task1;

public class Main {
    public static void main(String[] args) {
        InputApp inputApp = new InputApp();
        Workers workers =  inputApp.inputWorkers();
        workers.printWorkers();
        workers.printLastNames(inputApp.inputYearSearchValue());
    }
}
