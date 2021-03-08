package com.java_essential.varycheva.essential.homework.hw7.task1;

public enum Animals {

    LEO(7),
    TIGER(5),
    ELEPHANT(90),
    GIRAFFE(46);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name=" + this.name() +
                ", age=" + age +
                '}';
    }
}
