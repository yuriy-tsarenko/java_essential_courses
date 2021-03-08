package com.java_essential.kopaiev.essential.homework.lesson3.task4;

import java.util.ArrayList;
import java.util.List;

public class KeysDB {
    private String[] proKeys = new String[]{
            "X1X1X2C2",
            "X1z1d2f2",
            "X2X2X2C2"
    };

    private String[] expertKeys = new String[]{
            "EXP1DEBUG",
            "EXP8888",
            "EXP7676"
    };


    public boolean isKeyProExisted(String key) {
        for (String proKey : proKeys) {
            return key.equals(proKey);
        }
        return false;
    }

    public boolean isKeyExpertExisted(String key) {
        for (String expertKey : expertKeys) {
            return key.equals(expertKey);
        }
        return false;
    }

}
