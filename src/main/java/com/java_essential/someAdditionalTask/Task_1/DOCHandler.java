package com.java_essential.someAdditionalTask.Task_1;
/*Создайте класс AbstractHandler. В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler. Написать программу,
которая будет выполнять определение документа и для каждого формата должны быть методы открытия, создания, редактирования,
сохранения определенного формата документа.*/
public class DOCHandler extends AbstractHandler{
    @Override
    public void open(){
        System.out.println("DOC document has been opened!");
    }

    @Override
    public void create(){
        System.out.println("DOC document has been created!");
    }

    @Override
    public void change(){
        System.out.println("DOC document has been changed!");
    }

    @Override
    public void save(){
        System.out.println("DOC document has been saved!");
    }
}
