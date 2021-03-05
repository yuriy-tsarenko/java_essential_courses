package com.java_essential.Cherednichenko.extra_task.CustomerService.utilityRepository;

import com.java_essential.Cherednichenko.extra_task.CustomerService.Customer;
import com.java_essential.Cherednichenko.extra_task.CustomerService.SupportSpecialist;

public class SchemeForSupportSpecialist implements InterfaceScheme{
    @Override
    public void allItem() {
        for (SupportSpecialist supportSpecialist : CustomerServiceData.supportSpecialistList) {
            System.out.println(supportSpecialist.toString());
        }
    }

    @Override
    public void allItemByID(int id) {
        for (SupportSpecialist supportSpecialist : CustomerServiceData.supportSpecialistList) {
            if (supportSpecialist.getId() == id) {
                System.out.println(supportSpecialist.toString());
            }
        }
    }

    @Override
    public void allItemByName(String name) {
        for (SupportSpecialist supportSpecialist : CustomerServiceData.supportSpecialistList) {
            if (supportSpecialist.getUserName().equals(name)) {
                System.out.println(supportSpecialist.toString());
            }
        }
    }
}
