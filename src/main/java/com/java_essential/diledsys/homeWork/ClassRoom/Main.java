package com.java_essential.diledsys.homeWork.ClassRoom;

public class Main {


    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("Class Room1");
        ClassRoom classRoom1=new ClassRoom( new GoodPupil(),new ExcelentPupil());
        System.out.println("--------------------------------------");
        System.out.println("Class Room2");
        ClassRoom classRoom2=new ClassRoom( new GoodPupil(),new ExcelentPupil(),new BadPupil());
        System.out.println("--------------------------------------");
        System.out.println("Class Room3");
        ClassRoom classRoom3=new ClassRoom( new ExcelentPupil(),new GoodPupil(),new ExcelentPupil(),new BadPupil());
        System.out.println("--------------------------------------");
    }

}
