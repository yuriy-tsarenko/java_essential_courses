package com.java_essential.Class_7.Task_1;
/*Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать целочисленное значение (возраст животного),
 и содержать перегруженный метод toString(), который должен возвращать название экземпляра и возраст животного.*/

public enum Animals {
    TIGER(10), CAT(9), DOG(11), SWALLOW(4);
    int age;
    Animals(int age){
        this.age = age;
    }

    public String toString(){
        return "Name is " + super.toString() + "; Age is " + age + ";";
    }
}


