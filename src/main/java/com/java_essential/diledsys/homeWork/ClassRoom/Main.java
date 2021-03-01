package com.java_essential.diledsys.homeWork.ClassRoom;

public class Main {

    public static void main(String[] args) {
        System.out.println( "--------------------------------------" );
        System.out.println( "Class Room1" );
        new ClassRoom( new GoodPupil(), new ExcelentPupil() ).getPupil();
        System.out.println( "--------------------------------------" );
        System.out.println( "Class Room2" );
        new ClassRoom( new GoodPupil(), new ExcelentPupil(), new BadPupil() ).getPupil();
        System.out.println( "--------------------------------------" );
        System.out.println( "Class Room3" );
        new ClassRoom( new ExcelentPupil(), new GoodPupil(), new ExcelentPupil(), new BadPupil() ).getPupil();
        System.out.println( "--------------------------------------" );
    }
}
