package com.javae_ssential.diledsys.homeWork.webSupport;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serialize {

    public static void serializable(Object object, String id) throws IOException {

        String fPath = BasePath.get() + id + ".db";
        try (FileOutputStream fs = new FileOutputStream(fPath);
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {
            oos.writeObject(object);
        }
    }

    public static Object deserializable(String fileNameId) throws IOException {

        String fPath = BasePath.get() + fileNameId + ".db";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fPath);
        } catch (FileNotFoundException e) {
            return null;
            //e.printStackTrace();
        }
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            return ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void metod(){


    }
}
