package com.java_essential.diledsys.homeWork.webSupport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputLowerCase {

    public static String input(String coment) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(coment);
        return bf.readLine();
    }
}
