package com.java_essential.kopaiev.essential.classwork.lesson3.task1;

public interface FirstInterface extends SecondInterface, ThirdInterface{

    @Override
    default void method() {

    }
}
