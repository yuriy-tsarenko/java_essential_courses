package com.java_essential.tsarenko.lesson10.memory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public List<Integer> readFile() {
        AppContext context = new AppContext();
        List<Integer> buffer = new ArrayList<>();
        int flag;
        try {
            FileInputStream stream = new FileInputStream(context.getFilePath());
            while (-1 != (flag = stream.read())) {
                buffer.add(flag);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
