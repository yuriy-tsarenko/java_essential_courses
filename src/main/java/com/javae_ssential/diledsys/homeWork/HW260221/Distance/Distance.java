package com.javae_ssential.diledsys.homeWork.HW260221.Distance;

public class Distance {
    double distance;
    public void print(){
        System.out.println(distance);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public static class Converter{

        public static double km(double metr){
          return  metr*1000;
        }
        public static double sm(double metr){
            return metr*100;
        }
        public static double ml(double metr){
            return metr*0.00062;
        }


    }

    public static void main(String[] args) {
        Distance distance = new Distance();
        distance.setDistance(10);
        System.out.println("Distance="+distance.getDistance());
        System.out.println(Converter.km(10));
        System.out.println(Converter.sm(10));
        System.out.println(Converter.ml(100));
        //1km в см
        System.out.println(Converter.km(Converter.sm(1)));

    }
}
