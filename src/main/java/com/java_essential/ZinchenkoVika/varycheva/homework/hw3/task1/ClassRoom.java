package com.java_essential.ZinchenkoVika.varycheva.homework.hw3.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ClassRoom {

    private final ArrayList<Pupil> students = new ArrayList<>();

    public ClassRoom(Pupil ... students){
        Objects.requireNonNull(this.students).addAll(Arrays.asList(students));
    }

    public void printInfoAboutStudents(){
        for (Pupil p: students) {
            p.study();
            p.read();
            p.write();
            p.relax();
            System.out.println("-----------------------------------------");
        }
    }
}
