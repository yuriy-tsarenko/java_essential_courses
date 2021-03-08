package com.java_essential.ready_tasks.lesson8.examples.ex009_exceptions;

/**
 * Обработка внутренних исключений.
 */
class ClassWithException {
    public void throwInner() throws Exception {
        throw new Exception("Это внешнее исключение!");
    }

    public void catchInner() {
        try {
            throw new Exception("Это внутренее исключение!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ClassWithException instance = new ClassWithException();
        instance.catchInner(); // Попробовать вызвать.
        try {
            instance.throwInner();
        } catch (Exception exception) {
            System.out.println("Exception caught: " + exception.getMessage());
            System.out.println("Cause Exception:  " + exception.getCause());
        }
    }
}
