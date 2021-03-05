package com.java_essential.diledsys.myExperiments.loger;

import java.io.*;
import java.net.URLDecoder;
import java.util.Calendar;

public class SimpleLog {
    private static FileOutputStream fis;

    public static void log(String str) {
        if (fis == null) getPath();
        try {
            Calendar calendar = Calendar.getInstance();
            String d = "\n" + calendar.getTime() + "\n";
            fis.write(d.getBytes());
            fis.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getPath() {
        File currentClass = null;
        try {
            currentClass = new File(URLDecoder.decode(SimpleLog.class
                    .getProtectionDomain()
                    .getCodeSource()
                    .getLocation()
                    .getPath(), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        new File(currentClass.getPath() + "\\log\\").mkdir();
        try {
            fis = new FileOutputStream(new File(currentClass.getPath() + "\\log\\" + "log.txt"), true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
