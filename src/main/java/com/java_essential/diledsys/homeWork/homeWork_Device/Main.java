package com.java_essential.diledsys.homeWork.homeWork_Device;

public class Main {

    public static void main(String[] args) {

        Device device = new Device("Samsung",120,"AB1234567CD");
        Device device2 = new Device("Samsung",121,"AB1234567CD");
        Device device3 = new Device("Samsung",121,"AB1234567CD");

        EthernetAdapter ethernetAdapter = new EthernetAdapter(1280,"e50010a12002");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter(1280,"e50010a12002");
        Monitor monitor = new Monitor(1280,1024);
        Monitor monitor2 = new Monitor(1280,800);

        System.out.println(device.equals(device2));
        System.out.println(ethernetAdapter.equals(ethernetAdapter2));
        System.out.println(monitor.equals(monitor2));
        System.out.println(device.hashCode());
        System.out.println(device2.hashCode());
        System.out.println(device3.hashCode());
        boolean isSame = device2 == device3;
        System.out.println("Object is same:"+isSame);
         isSame = device2.hashCode() == device3.hashCode();
        System.out.println("instance fields is same:"+isSame);


    }
}
