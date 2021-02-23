package com.java_essential.Cherednichenko.extra_task.CustomerService.utilityRepository;

import com.java_essential.Cherednichenko.extra_task.CustomerService.Customer;
import com.java_essential.Cherednichenko.extra_task.CustomerService.Service;

public class SchemeForService implements InterfaceScheme {
    @Override
    public void allItem() {
        for (Service service : CustomerServiceData.serviceList) {
            System.out.println(service.toString());
        }
    }

    @Override
    public void allItemByID(int id) {
        for (Service service : CustomerServiceData.serviceList) {
            if (service.getId() == id) {
                System.out.println(service.toString());
            }
        }
    }

    @Override
    public void allItemByName(String name) {
        for (Service service : CustomerServiceData.serviceList) {
            if (service.getServiceName().equals(name)) {
                System.out.println(service.toString());
            }
        }
    }
    public void addCustomer(int idCustomer, int idService) {
        for (Service service : CustomerServiceData.serviceList) {
            if (service.getId() == idService) {
                for (Customer customer : CustomerServiceData.customerList) {
                    if (customer.getId()==idCustomer) {
                        service.setListCustomer(customer.getId());
                        customer.setlistService(service.getId());
                    }
                }
            }
        }
    }
}
