package com.java_essential.diledsys.homeWork.ClassRoom;

public class ClassRoom {

    private final Pupil[] pupil = new Pupil[4];

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        pupil[0] = pupil1;
        pupil[1] = pupil2;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        pupil[0] = pupil1;
        pupil[1] = pupil2;
        pupil[2] = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        pupil[0] = pupil1;
        pupil[1] = pupil2;
        pupil[2] = pupil3;
        pupil[3] = pupil4;
    }

    public void getPupil() {
        for (Pupil pupils : pupil) {
            if (pupils != null) {
                System.out.println( pupils.getClass().getSimpleName() );
                pupils.study();
                pupils.read();
                pupils.write();
                pupils.relax();
            }
        }
    }
}
