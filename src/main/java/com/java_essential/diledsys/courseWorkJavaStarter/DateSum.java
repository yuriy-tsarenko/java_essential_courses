package com.java_essential.diledsys.courseWorkJavaStarter;

public class DateSum {
    public static void main(String[] args) {

        String date = "02/11/1995";
        date=date.replace("/","");
        int sum = 0;
        for (String ch:date.split("")){
            System.out.print(ch+"+");
            sum+=Integer.parseInt(ch);
        }
        System.out.print(" = " + sum);
    }
}
