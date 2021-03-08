package com.java_essential.someAdditionalTask.Task_1;
/*Создайте класс AbstractHandler. В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler. Написать программу,
которая будет выполнять определение документа и для каждого формата должны быть методы открытия, создания, редактирования,
сохранения определенного формата документа.*/

public abstract class AbstractHandler {
    abstract void open();
    abstract void create();
    abstract void change();
    abstract void save();
}
