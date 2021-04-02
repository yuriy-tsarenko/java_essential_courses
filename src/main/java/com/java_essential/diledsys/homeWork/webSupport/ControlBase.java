package com.java_essential.diledsys.homeWork.webSupport;

import java.io.IOException;

public class ControlBase {

    public static void allCustomer() throws IOException {

        for (UserData customer : DataB.inquiry("Customer")) {
            System.out.println("--------------------------------------");
            //if (userData.getClass().getName().equals("Customer")) {
            System.out.println(customer.toString());

            if (!customer.getProfileId().equals("0")) {
                for (UserData profile : DataB.inquiry("Profile")) {
                    if (profile.getId().equals(customer.getProfileId())) {
                        System.out.println(profile.toString());
                    }
                }
            }
            for (String idServ : customer.getIdService()) {
                for (UserData service : DataB.inquiry("Service")) {
                    if (service.getId().equals(idServ)) {
                        System.out.print(service.toString());
                    }
                }
            }
            System.out.println();
        }
    }

    public static void allService() throws IOException {
        for (UserData service : DataB.inquiry("Service")) {
            System.out.print("id service: " + service.getId() + "\n" +
                    "service name: " + service.getServiceName() + "\n");
        }
    }

    public static void allProfile() throws IOException {
        for (UserData profile : DataB.inquiry("Profile")) {
            System.out.println(profile.toString());
        }
    }

    public static boolean allSpicialist(String id) throws IOException {
        boolean empty = false;
        for (UserData userData : DataB.inquiry("SupportSpecialist")) {
            System.out.println(userData.toString());
            if (!userData.getProfileId().equals("0")) {
                for (UserData profile : DataB.inquiry("Profile")) {
                    if (profile.getId().equals(userData.getProfileId())) {
                        System.out.println(profile.toString());
                    }
                }
            }
            if (id.equals(userData.getId())) empty = true;
        }
        return empty;
    }

    public static void allTikets() throws IOException {
        for (UserData tiket : DataB.inquiry("Tiket")) {

            if (!tiket.getCustomerID().equals("0")) {
                for (UserData customer : DataB.inquiry("Customer")) {
                    if (customer.getId().equals(tiket.getCustomerID())){
                        System.out.println(customer.toString());
                        System.out.println(tiket.toString());
                }
           }
            }
        }
    }
    public static void allTiketsSupport() throws IOException {
        for (UserData tiket : DataB.inquiry("Tiket")) {
            if (!tiket.getCustomerID().equals("0")) {
                for (UserData support : DataB.inquiry("SupportSpecialist")) {
                    if (support.getId().equals(tiket.getCustomerID()))
                        System.out.println(support.toString());
                    System.out.println(tiket.toString());
                }
            }
        }

    }
}

