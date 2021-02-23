package com.java_essential.Cherednichenko.extra_task.CustomerService;

import com.java_essential.Cherednichenko.extra_task.CustomerService.utilityRepository.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SupportServiceVer2 {
    public static void main(String[] args) throws IOException {
        SchemeForCustomer schemeForCustomer = new SchemeForCustomer();
        SchemeForProfile schemeForProfile = new SchemeForProfile();
        SchemeForService schemeForService = new SchemeForService();
        SchemeForSupportSpecialist schemeForSupportSpecialist = new SchemeForSupportSpecialist();
        SchemeForTicket schemeForTicket = new SchemeForTicket();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Add Customer - 1");
            System.out.println("Add SupportSpecialist - 2");
            System.out.println("Add Service - 3");
            System.out.println("Add Ticket - 4");
            System.out.println("-------------------------");
            System.out.println("#fetch_all_customers - 5");
            System.out.println("#fetch_all_tikets - 6");
            System.out.println("#fetch_all_specialists - 7");
            System.out.println("#feth_all_profiles - 8");
            System.out.println("#feth_all_services - 9");
            System.out.println("#save_tiket_to_file_{id} - 10");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter ID:");
                    int customerID = scanner.nextInt();
                    System.out.println("Enter Username:");
                    String customerUsername = scanner.next();
                    System.out.println("Enter Password:");
                    String customerPassword = scanner.next();
                    System.out.println("Please create a profile for the client");
                    System.out.println("Enter ProfileID:");
                    int profileID = scanner.nextInt();
                    System.out.println("Enter FirstName:");
                    String firstName = scanner.next();
                    System.out.println("Enter LastName:");
                    String lastName = scanner.next();
                    System.out.println("Enter email:");
                    String email = scanner.next();
                    System.out.println("Enter PhoneNumber:");
                    String phoneNumber = scanner.next();
                    System.out.println("Enter Address:");
                    String address = scanner.next();
                    System.out.println("Enter PostalCode:");
                    String postalCode = scanner.next();
                    CustomerServiceData.customerList.add(new Customer(customerID, customerUsername, customerPassword, profileID));
                    CustomerServiceData.profileList.add(new Profile(profileID, firstName, lastName, email, phoneNumber, address, postalCode, customerID));
                    System.out.println("Enter Service name:");
                    String customerServiceName = scanner.next();
                    schemeForCustomer.addService(customerServiceName, customerID);
                    break;
                case 2:
                    System.out.println("Enter ID:");
                    int supportSpecialistID = scanner.nextInt();
                    System.out.println("Enter Username:");
                    String supportSpecialistIDUsername = scanner.next();
                    System.out.println("Enter Password:");
                    String supportSpecialistIDPassword = scanner.next();
                    System.out.println("Please create a profile for the SupportSpecialist");
                    System.out.println("Enter ProfileID:");
                    int profileIDSupportSpecialist = scanner.nextInt();
                    System.out.println("Enter FirstName:");
                    String firstNameSupportSpecialist = scanner.next();
                    System.out.println("Enter LastName:");
                    String lastNameSupportSpecialist = scanner.next();
                    System.out.println("Enter email:");
                    String emailSupportSpecialist = scanner.next();
                    System.out.println("Enter PhoneNumber:");
                    String phoneNumberSupportSpecialist = scanner.next();
                    System.out.println("Enter Address:");
                    String addressSupportSpecialist = scanner.next();
                    System.out.println("Enter PostalCode:");
                    String postalCodeSupportSpecialist = scanner.next();
                    CustomerServiceData.supportSpecialistList.add(new SupportSpecialist(supportSpecialistID, supportSpecialistIDUsername, supportSpecialistIDPassword, supportSpecialistID));
                    CustomerServiceData.profileList.add(new Profile(profileIDSupportSpecialist, firstNameSupportSpecialist, lastNameSupportSpecialist, emailSupportSpecialist, phoneNumberSupportSpecialist, addressSupportSpecialist, postalCodeSupportSpecialist, supportSpecialistID));
                    break;
                case 3:
                    System.out.println("Enter ID:");
                    int serviceId = scanner.nextInt();
                    System.out.println("Enter ServiceName:");
                    String serviceName = scanner.next();
                    System.out.println("Enter IsActive:");
                    String isActive = scanner.next();
                    System.out.println("Enter ServiceMonthPrice:");
                    String serviceMonthPrice = scanner.next();
                    CustomerServiceData.serviceList.add(new Service(serviceId, serviceName, isActive, serviceMonthPrice));
                    System.out.println("Enter Customer ID:");
                    int customerIDForService = scanner.nextInt();
                    schemeForService.addCustomer(customerIDForService, serviceId);
                    break;
                case 4:
                    System.out.println("Enter ID:");
                    int ticketId = scanner.nextInt();
                    System.out.println("Enter ServiceName:");
                    String ticketServiceName = scanner.next();
                    System.out.println("Enter ProblemDescription:");
                    String problemDescription = scanner.next();
                    System.out.println("Enter IsActive:");
                    String active = scanner.next();
                    System.out.println("Enter CustomerID:");
                    int customerIDForTicket = scanner.nextInt();
                    System.out.println("Enter SupportSpecialist:");
                    int supportSpecialistForTicket = scanner.nextInt();
                    CustomerServiceData.tiketsList.add(new Tiket(ticketId, ticketServiceName, problemDescription, active, customerIDForTicket, supportSpecialistForTicket));
                    schemeForTicket.addTicketToCustomerAndSupportSpecialist(ticketId, supportSpecialistForTicket, customerIDForTicket);
                    break;
                case 5:
                    for (Customer customer : CustomerServiceData.customerList) {
                        System.out.println(customer.toString());
                        schemeForProfile.allItemByID(customer.getProfileID());
                    }
                    break;
                case 6:
                    for (Tiket tiket : CustomerServiceData.tiketsList) {
                        System.out.println(tiket.toString());
                        schemeForCustomer.allItemByID(tiket.getCustomerID());
                    }
                    break;
                case 7:
                    for (SupportSpecialist supportSpecialist : CustomerServiceData.supportSpecialistList) {
                        System.out.println(supportSpecialist.toString());
                        schemeForProfile.allItemByID(supportSpecialist.getProfileID());
                        for (Integer tiket : supportSpecialist.getlistTiket()) {
                            schemeForTicket.allItemByID(tiket);
                        }
                    }
                    break;
                case 8:
                    for (Profile profile : CustomerServiceData.profileList) {
                        System.out.println(profile.toString());
                        schemeForCustomer.allItemByID(profile.getCustomerID());
                    }
                    break;
                case 9:
                    for (Service service : CustomerServiceData.serviceList) {
                        System.out.println(service.toString());
                        for (Integer customer : service.getlistCustomer()) {
                            schemeForCustomer.allItemByID(customer);
                        }
                    }
                    break;
                case 10:
                    System.out.println("Enter TicketId: ");
                    int ticket = scanner.nextInt();
                    FileWriter writer = new FileWriter("Ticket_" + ticket + ".txt", false);
                    for (Tiket tiket : CustomerServiceData.tiketsList) {
                        if (tiket.getId() == ticket) {
                            writer.write(tiket.toString());
                            for (Customer customer : CustomerServiceData.customerList) {
                                if (customer.getId() == tiket.getCustomerID()) {
                                    writer.write(customer.toString());
                                }
                            }
                            for (SupportSpecialist supportSpecialist : CustomerServiceData.supportSpecialistList) {
                                if (supportSpecialist.getId() == tiket.getSupportSpecialistID()) {
                                    writer.write(supportSpecialist.toString());
                                }
                            }
                        }
                    }
                    writer.flush();
                    break;
            }
            System.out.println("Press any number");
        } while (!scanner.next().equals("exit"));
    }
}
