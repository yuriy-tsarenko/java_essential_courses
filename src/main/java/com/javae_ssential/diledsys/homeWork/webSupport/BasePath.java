package com.javae_ssential.diledsys.homeWork.webSupport;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BasePath {
    private static File currentClass = null;
    public static String get() throws UnsupportedEncodingException {
        if (currentClass==null) {
            currentClass = new File(URLDecoder.decode(SupportService.class
                    .getProtectionDomain()
                    .getCodeSource()
                    .getLocation()
                    .getPath(), "UTF-8"));
            boolean isderectory = Files.isDirectory(Paths.get(currentClass.toPath() + "\\database\\"));
            if (!isderectory) {
                new File(currentClass.getParent() + "\\database\\").mkdir();
            }
        }
        return currentClass.getParent()+"\\database\\";
    }
}
