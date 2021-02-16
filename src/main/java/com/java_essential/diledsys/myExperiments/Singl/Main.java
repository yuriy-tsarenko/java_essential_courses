package com.java_essential.diledsys.myExperiments.Singl;

public class Main {

    public static void main(String[] args) {
                
       Singl singl1=Singl.calc();
        System.out.println("Claas: "+singl1.getClass().getSimpleName());
        System.out.println("count= "+singl1.getCount());
// переменная count остаеться той же
        Singl singl2=Singl.calc();
        System.out.println("Claas: "+singl2.getClass().getSimpleName());
        System.out.println("count= "+singl2.getCount());
// переменная count остаеться той же
        Singl singl3=Singl.calc();
        System.out.println("Claas: "+singl3.getClass().getSimpleName());
        System.out.println("count= "+singl3.getCount());
// так как сылочная переменная не изменяеться
    }
}
