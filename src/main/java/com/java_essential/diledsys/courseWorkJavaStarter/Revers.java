package com.java_essential.diledsys.courseWorkJavaStarter;

public class Revers {
    public static void main(String[] args) {
        System.out.println(revers(7891));

    }
    public static int revers(int num ){

        if (!String.valueOf(num).contains("0")){
            StringBuffer sb=new StringBuffer(String.valueOf(num));
            System.out.println("перевертыш:");
            return Integer.parseInt(sb.reverse().toString());
        }
        else{
            System.out.println("присутствует 0 реверса, не буде");return num;}
    }
}
