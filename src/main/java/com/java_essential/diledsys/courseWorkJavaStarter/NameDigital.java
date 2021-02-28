package com.java_essential.diledsys.courseWorkJavaStarter;

import java.util.Scanner;

public class NameDigital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name:");
        String str =sc.nextLine();
        int l=0;
        int s=0;
        for (int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            int code=ch.hashCode()-64;
            s+=code;
            System.out.print(ch+"(" +code+ ")");
            if (i<str.length()-1) System.out.print("+");
        }
        System.out.print(" ="+s);
    }
}
