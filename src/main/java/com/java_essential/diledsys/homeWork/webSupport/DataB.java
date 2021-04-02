package com.java_essential.diledsys.homeWork.webSupport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataB {

       public static List<Object> load() throws IOException {// загружаем базу
        Object obj;
        List<Object> objectList = new ArrayList<>();
        int count = 1;
        while ((obj = Serialize.deserializable(String.valueOf(count))) != null) {
            count++;
            objectList.add(obj);
        }
        return objectList;
    }

     public static List<UserData> inquiry(String type) throws IOException {  //делаем запрос по типу
        UserData userData =null;
        List<UserData> userDataList = new ArrayList<>();
        for (Object o : load()) {
            if (o.getClass().getSimpleName().equals(type)) {
                userData = (UserData) o;
                userDataList.add(userData);
            }
        }
        return userDataList;
        }
}
