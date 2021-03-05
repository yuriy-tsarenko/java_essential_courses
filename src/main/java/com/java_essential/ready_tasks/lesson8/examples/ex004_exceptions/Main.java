package com.java_essential.ready_tasks.lesson8.examples.ex004_exceptions;

import java.lang.Exception;

/**
 * Обработка исключений.
 */
class Demo {
    public void someWork() throws Exception {
        throw new Exception();
    }
}

class MyClass {
    public void myMethod() throws Exception {
        Demo demo = new Demo();
        demo.someWork();
    }

    public void myMethodTwo() {
        Demo demo = new Demo();
        try {
            demo.someWork();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        MyClass myClass = new MyClass();
//        myClass.myMethod();
        myClass.myMethodTwo();
        printMessage();
    }

    public static void printMessage(){
        System.out.println("Message!!!");
    }
}
