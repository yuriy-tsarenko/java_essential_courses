package com.java_essential.Class_7.Task_2;

/* Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать целочисленное значение (стоимость автомобиля),
содержать метод getColor(), который возвращает строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
строку с названием экземпляра, цветом и стоимостью автомобиля.*/
public enum Vehicle {
    CAR(30000, "green"), SHIP(5000000,"white"), PLANE(10000000, "blue");
    int price;
    String colour;

    Vehicle(int price, String colour) {
        this.price = price;
        this.colour = colour;
    }

    String getColour(){
        return colour;
    }

    public String toString(){
        return "Type = " + super.toString() + "; Colour = " + getColour() + "; Price = " + price;
    }


}
