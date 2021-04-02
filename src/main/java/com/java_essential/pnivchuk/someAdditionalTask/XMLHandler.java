package com.java_essential.pnivchuk.someAdditionalTask;
/*Создайте класс AbstractHandler. В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler. Написать программу,
которая будет выполнять определение документа и для каждого формата должны быть методы открытия, создания, редактирования,
сохранения определенного формата документа.*/
public class XMLHandler extends AbstractHandler{
    @Override
    public void open(){
        System.out.println("XML document has been opened!");
    }

    @Override
    public void create(){
        System.out.println("XML document has been created!");
    }

    @Override
    public void change(){
        System.out.println("XML document has been changed!");
    }

    @Override
    public void save(){
        System.out.println("XML document has been saved!");
    }
}
