package com.java_essential.Cherednichenko.extra_task.CustomerService.utilityRepository;

import com.java_essential.Cherednichenko.extra_task.CustomerService.Customer;
import com.java_essential.Cherednichenko.extra_task.CustomerService.Service;

import java.util.ArrayList;
import java.util.List;

public class SchemeForCustomer implements InterfaceScheme {

    @Override
    public void allItem() {
        for (Customer customer : CustomerServiceData.customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void allItemByID(int id) {
        for (Customer customer : CustomerServiceData.customerList) {
            if (customer.getId() == id) {
                System.out.println(customer.toString());
            }
        }
    }

    @Override
    public void allItemByName(String name) {
        for (Customer customer : CustomerServiceData.customerList) {
            if (customer.getUsername().equals(name)) {
                System.out.println(customer.toString());
            }
        }
    }

    public void addService(String nameService, int IDCustomer) {
        for (Customer customer : CustomerServiceData.customerList) {
            if (customer.getId() == IDCustomer) {
                for (Service service : CustomerServiceData.serviceList) {
                    if (service.getServiceName().equals(nameService)) {
                        customer.setlistService(service.getId());
                        service.setListCustomer(customer.getId());
                    }
                }
            }
        }
    }
}
