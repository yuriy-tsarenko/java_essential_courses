package com.java_essential.pnivchuk.Task_1;
/*Описать класс с именем Worker, содержащую следующие поля: фамилия и инициалы работника;  название занимаемой должности;
год поступления на работу. Написать программу, выполняющую следующие действия:  ввод с клавиатуры данных в массив,
состоящий из пяти элементов типа Worker (записи должны быть упорядочены по алфавиту);  если значение года введено не в
соответствующем формате выдает исключение.  вывод на экран фамилии работника, стаж работы которого превышает введенное значение.*/
public class Worker {
    private String name;
    private String position;
    private int yearOFEntrance;

    public Worker(String name, String position, int yearOFEntrance){
        this.name = name;
        this.position = position;
        this.yearOFEntrance = yearOFEntrance;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getYearOFEntrance() {
        return yearOFEntrance;
    }
}
