package com.java_essential.Cherednichenko.extra_task.CustomerService.utilityRepository;

import com.java_essential.Cherednichenko.extra_task.CustomerService.Customer;
import com.java_essential.Cherednichenko.extra_task.CustomerService.SupportSpecialist;
import com.java_essential.Cherednichenko.extra_task.CustomerService.Tiket;

public class SchemeForTicket implements InterfaceScheme {
    @Override
    public void allItem() {
        for (Tiket tiket : CustomerServiceData.tiketsList) {
            System.out.println(tiket.toString());
        }
    }

    @Override
    public void allItemByID(int id) {
        for (Tiket tiket : CustomerServiceData.tiketsList) {
            if (tiket.getId() == id) {
                System.out.println(tiket.toString());
            }
        }
    }

    @Override
    public void allItemByName(String name) {
        for (Tiket tiket : CustomerServiceData.tiketsList) {
            if (tiket.getServiceName().equals(name)) {
                System.out.println(tiket.toString());
            }
        }
    }

    public void addTicketToCustomerAndSupportSpecialist(int TicketID, int supportSpecialistID, int customerID) {
        for (SupportSpecialist supportSpecialist : CustomerServiceData.supportSpecialistList) {
            if (supportSpecialist.getId() == supportSpecialistID) {
                supportSpecialist.setlistTiket(TicketID);
            }
        }
        for (Customer customer : CustomerServiceData.customerList) {
            if (customer.getId() == customerID) {
                customer.setlistTiket(TicketID);
            }
        }

    }
}
