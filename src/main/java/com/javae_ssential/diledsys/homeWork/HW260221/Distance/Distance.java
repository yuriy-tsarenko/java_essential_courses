package com.javae_ssential.diledsys.homeWork.HW260221.Distance;

public class Distance {
    double distance;
    public void print(){

    }
    public static class Converter{

        public void converter(double n){

            double km=n*1000;
            double ml=km*.62;
            System.out.println(n+"m= "+km+"km");
            System.out.println(km+"km= "+ml+"ml");
        }

    }
}
