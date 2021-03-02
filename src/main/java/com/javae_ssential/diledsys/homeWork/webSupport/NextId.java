package com.javae_ssential.diledsys.homeWork.webSupport;

import java.io.IOException;
import java.util.List;


public class NextId {
    private static List<Object> obj;

    public static String getLastId() {

        try {
            obj = DataB.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //--ncSystem.out.println("size= "+obj.size());
        return String.valueOf(obj.size() + 1);
    }
}
