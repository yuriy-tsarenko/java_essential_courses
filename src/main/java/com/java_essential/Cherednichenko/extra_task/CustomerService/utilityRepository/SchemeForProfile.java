package com.java_essential.Cherednichenko.extra_task.CustomerService.utilityRepository;

import com.java_essential.Cherednichenko.extra_task.CustomerService.Profile;

public class SchemeForProfile implements InterfaceScheme {

    public void allItem() {
        for (Profile profile : CustomerServiceData.profileList) {
            System.out.println(profile.toString());
        }
    }

    @Override
    public void allItemByID(int id) {
        for (Profile profile : CustomerServiceData.profileList) {
            if (profile.getId() == id) {
                System.out.println(profile.toString());
            }
        }
    }

    public void allItemByCustomerID(int id) {
        for (Profile profile : CustomerServiceData.profileList) {
            if (profile.getCustomerID() == id) {
                System.out.println(profile.toString());
            }
        }
    }

    public void allItemBySpecialistID(int id) {
        for (Profile profile : CustomerServiceData.profileList) {
            if (profile.getSupportSpecialistID() == id) {
                System.out.println(profile.toString());
            }
        }
    }

    @Override
    public void allItemByName(String name) {
        for (Profile profile : CustomerServiceData.profileList) {
            if (profile.getLastName().equals(name)) {
                System.out.println(profile.toString());
            }
        }
    }
}
