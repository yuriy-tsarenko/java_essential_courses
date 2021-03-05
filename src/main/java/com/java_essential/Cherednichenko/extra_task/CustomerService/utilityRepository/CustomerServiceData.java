package com.java_essential.Cherednichenko.extra_task.CustomerService.utilityRepository;

import com.java_essential.Cherednichenko.extra_task.CustomerService.*;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceData {
    public static List<Customer> customerList = new ArrayList<>();
    public static List<Profile> profileList = new ArrayList<>();
    public static List<SupportSpecialist> supportSpecialistList = new ArrayList<>();
    public static List<Service> serviceList = new ArrayList<>();
    public static List<Tiket> tiketsList = new ArrayList<>();

    static {
        customerList.add(new Customer(1, "Username#1", "12345", 1));
        profileList.add(new Profile(1, "FirstName#1", "LastName#2", "email", "123456789", "Address", "123", 1, 0));
        customerList.add(new Customer(2, "Username#2", "12345", 2));
        profileList.add(new Profile(2, "FirstName#2", "LastName#2", "email", "123456789", "Address", "123", 2, 0));
        supportSpecialistList.add(new SupportSpecialist(1, "Userame#4", "12345", 3));
        profileList.add(new Profile(3, "FirstName#4", "LastName#4", "email", "123456789", "Address", "123", 0, 1));
        supportSpecialistList.add(new SupportSpecialist(2, "Userame#5", "12345", 4));
        profileList.add(new Profile(4, "FirstName#5", "LastName#5", "email", "123456789", "Address", "123", 0, 2));
        serviceList.add(new Service(1, "ServiceName1", "Active", "10000$"));
        serviceList.add(new Service(2, "ServiceName2", "Active", "10000$"));
        tiketsList.add(new Tiket(1, "ServiceName1", "Problem", "Active", 1, 1));
        tiketsList.add(new Tiket(2, "ServiceName1", "Problem", "Active", 2, 2));
        SchemeForCustomer schemeForCustomer = new SchemeForCustomer();
        schemeForCustomer.addService("ServiceName1", 1);
        schemeForCustomer.addService("ServiceName2", 2);
        SchemeForTicket schemeForTicket = new SchemeForTicket();
        schemeForTicket.addTicketToCustomerAndSupportSpecialist(1, 1, 1);
        schemeForTicket.addTicketToCustomerAndSupportSpecialist(2, 2, 2);

    }
}
