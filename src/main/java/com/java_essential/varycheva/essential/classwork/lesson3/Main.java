package com.java_essential.varycheva.essential.classwork.lesson3;

public class Main {

    public static void main(String[] args) {
        OtherClass instance = new OtherClass();
        instance.method();
        instance.someMethod();

        FirstInterface ins = new OtherClass();
        ins.method();
    }
}
