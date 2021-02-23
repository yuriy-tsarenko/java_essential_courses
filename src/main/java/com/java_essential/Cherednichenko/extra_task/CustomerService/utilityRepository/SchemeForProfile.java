package com.java_essential.Cherednichenko.extra_task.CustomerService.utilityRepository;

import com.java_essential.Cherednichenko.extra_task.CustomerService.Customer;
import com.java_essential.Cherednichenko.extra_task.CustomerService.Profile;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void allItemByName(String name) {
        for (Profile profile : CustomerServiceData.profileList) {
            if (profile.getLastName().equals(name)) {
                System.out.println(profile.toString());
            }
        }
    }
}
