package com.java_essential.diledsys.homeWork.enumAnimals;

public enum Animals {
    TIGR(1),
    CAT(5),
    DOG(2);

    public String toString() {
        return "Animals" +"\n"+
                "Tiger age = "+TIGR.age+"\n"+
                "Cat age = " + CAT.age +"\n"+
                "Dog age = "+ DOG.age;
    }
    private int age;
    Animals(int age) {
        this.age = age;
    }
}
