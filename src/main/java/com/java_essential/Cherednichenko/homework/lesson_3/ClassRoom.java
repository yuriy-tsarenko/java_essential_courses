package com.java_essential.Cherednichenko.homework.lesson_3;

public class ClassRoom {
    Pupil[] pupils;

    public static void main(String[] args) {
        Pupil[] pupils = new Pupil[4];
        pupils[0] = new BadPupil("Bad;", "Bad;");
        pupils[1] = new GoodPupil("Good;", "Good;", "Good;");
        //  pupils[2] = new GoodPupil("Good;", "Good;", "Good;", "Good;");
        //   pupils[3] = new ExcelentPupil("Excellent;", "Excellent;", "Excellent;", "Excellent;");
        ClassRoom classRoom = new ClassRoom(pupils);
        classRoom.show();
    }

    public ClassRoom(Pupil[] pupils) {
        this.pupils = pupils;
    }

    public void show() {
        for (int i = 0; i <= pupils.length - 1; i++) {
            if (pupils[i] != null) {
                System.out.print("Pupil " + (i + 1) + ": ");
                pupils[i].study();
                pupils[i].read();
                pupils[i].write();
                pupils[i].relax();
            }
        }
    }
}
