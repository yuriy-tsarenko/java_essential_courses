package com.java_essential.diledsys.homeWork.webSupport;

import java.io.IOException;

public class SupportService {

    public static void main(String[] args) throws IOException {
        while (true) {
            String enter = InputLowerCase.input(":");
            if (enter.equals("q")) {
                break;
            }
            Mode.modes(enter);
        }
    }
}
