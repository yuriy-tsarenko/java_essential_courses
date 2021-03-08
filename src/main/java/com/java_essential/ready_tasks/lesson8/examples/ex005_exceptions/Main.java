package com.java_essential.ready_tasks.lesson8.examples.ex005_exceptions;

/**
 * Обработка исключений.
 * <p>
 * Для создания пользовательского исключения, требуется наследование от Exception.
 */
class UserException extends Exception {
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }
}

class Demo {
    public static void someWork(){
//        throw new UserException();
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
