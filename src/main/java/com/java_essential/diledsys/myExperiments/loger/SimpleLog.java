package com.java_essential.diledsys.myExperiments.loger;

import java.io.*;
import java.util.Calendar;

public class SimpleLog {
    private static FileOutputStream fis;

    public static void log(String str) {
        if (fis == null) getPath();
        try {
            fis.write(date().getBytes());
            fis.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getPath() {
        new File(currentDir() + "\\log\\").mkdir();
        try {
            fis = new FileOutputStream(new File(currentDir() + "\\log\\" + "log.txt"), true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String date() {
        Calendar calendar = Calendar.getInstance();
        return "\n" + calendar.getTime() + "\n";
    }
    public static String currentDir(){
        String path=(String) System.getProperties().get("user.dir");
        return path;
    }
}
