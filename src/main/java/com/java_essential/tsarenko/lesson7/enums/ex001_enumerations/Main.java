package com.java_essential.tsarenko.lesson7.enums.ex001_enumerations;

import java.util.Scanner;

import static com.java_essential.tsarenko.lesson7.enums.ex001_enumerations.Error.*;

/**
 * Перечисляемые типы (enum).
 */
enum Error {
    NO_ERROR(0),
    ARGUMENT_REQUIRED(1),
    LOGIN_FAILED(2),
    SESSION_EXPIRED(5),
    NO_SESSION(6),
    NOT_AUTHORIZED(7),
    ACTION_FAILED(8),
    DEFAULT(9);

    private final int errorCode;

    Error(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getCode() {
        return errorCode;
    }

    public static Error checkValues(String value) {
        Error[] values = Error.values();
        Error checked = Error.DEFAULT;
        for (Error error : values) {
            if (value.equals(error.toString())) {
                checked = error;
            }
        }
        return checked;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();

        switch (Error.checkValues(line)) {
            case NO_ERROR:
                System.out.printf("%s - %d", NO_ERROR, NO_ERROR.getCode());
                break;
            case ARGUMENT_REQUIRED:
                System.out.printf("%s - %d", ARGUMENT_REQUIRED, ARGUMENT_REQUIRED.getCode());
                break;
            case LOGIN_FAILED:
                System.out.printf("%s - %d", LOGIN_FAILED, LOGIN_FAILED.getCode());
                break;
            case SESSION_EXPIRED:
                System.out.printf("%s - %d", SESSION_EXPIRED, SESSION_EXPIRED.getCode());
                break;
            case NO_SESSION:
                System.out.printf("%s - %d", NO_SESSION, NO_SESSION.getCode());
                break;
            case NOT_AUTHORIZED:
                System.out.printf("%s - %d%n", NOT_AUTHORIZED, NOT_AUTHORIZED.getCode());
                break;
            case ACTION_FAILED:
                System.out.printf("%s - %d%n", ACTION_FAILED, ACTION_FAILED.getCode());
                break;
            default:
                System.out.printf("%s - %d%n", DEFAULT, DEFAULT.getCode());
                break;
        }
    }
}

