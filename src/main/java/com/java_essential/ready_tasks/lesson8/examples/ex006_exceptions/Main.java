package com.java_essential.ready_tasks.lesson8.examples.ex006_exceptions;

import java.io.FileInputStream;

/**
 * Обработка исключений.
 * <p>
 * Для создания пользовательского исключения, требуется наследование от System.Exception.
 */
class UserException extends IndexOutOfBoundsException {
    public UserException() {
    }

    public UserException(String s) {
        super(s);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}
