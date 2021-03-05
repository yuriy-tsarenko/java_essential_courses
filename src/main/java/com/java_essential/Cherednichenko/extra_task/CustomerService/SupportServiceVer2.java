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
        int currentInt = 0;
        String currentString = "";
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
                    int customerID = inputInteger("Enter ID:");
                    String customerUsername = inputString("Enter Username:");
                    String customerPassword = inputString("Enter Password:");
                    int profileID = inputInteger("Please create a profile for the client\nEnter ProfileID:");
                    String firstName = inputString("Enter FirstName:");
                    String lastName = inputString("Enter LastName:");
                    String email = inputString("Enter email:");
                    String phoneNumber = inputString("Enter PhoneNumber:");
                    String address = inputString("Enter Address:");
                    String postalCode = inputString("Enter PostalCode:");
                    CustomerServiceData.customerList.add(new Customer(customerID, customerUsername, customerPassword, profileID));
                    CustomerServiceData.profileList.add(new Profile(profileID, firstName, lastName, email, phoneNumber, address, postalCode, customerID, 0));
                    String customerServiceName = inputString("Enter Service name:");
                    schemeForCustomer.addService(customerServiceName, customerID);
                    break;
                case 2:
                    int supportSpecialistID = inputInteger("Enter ID:");
                    String supportSpecialistIDUsername = inputString("Enter Username:");
                    String supportSpecialistIDPassword = inputString("Enter Password:");
                    int profileIDSupportSpecialist = inputInteger("Please create a profile for the SupportSpecialist\nEnter ProfileID:");
                    String firstNameSupportSpecialist = inputString("Enter FirstName:");
                    String lastNameSupportSpecialist = inputString("Enter LastName:");
                    String emailSupportSpecialist = inputString("Enter email:");
                    String phoneNumberSupportSpecialist = inputString("Enter PhoneNumber:");
                    String addressSupportSpecialist = inputString("Enter Address:");
                    String postalCodeSupportSpecialist = inputString("Enter PostalCode:");
                    CustomerServiceData.supportSpecialistList.add(new SupportSpecialist(supportSpecialistID, supportSpecialistIDUsername, supportSpecialistIDPassword, supportSpecialistID));
                    CustomerServiceData.profileList.add(new Profile(profileIDSupportSpecialist, firstNameSupportSpecialist, lastNameSupportSpecialist, emailSupportSpecialist, phoneNumberSupportSpecialist, addressSupportSpecialist, postalCodeSupportSpecialist, 0, supportSpecialistID));
                    break;
                case 3:
                    int serviceId = inputInteger("Enter ID:");
                    String serviceName = inputString("Enter ServiceName:");
                    String isActive = inputString("Enter IsActive:");
                    String serviceMonthPrice = inputString("Enter ServiceMonthPrice:");
                    CustomerServiceData.serviceList.add(new Service(serviceId, serviceName, isActive, serviceMonthPrice));
                    int customerIDForService = inputInteger("Enter Customer ID:");
                    schemeForService.addCustomer(customerIDForService, serviceId);
                    break;
                case 4:
                    int ticketId = inputInteger("Enter ID:");
                    String ticketServiceName = inputString("Enter ServiceName:");
                    String problemDescription = inputString("Enter ProblemDescription:");
                    String active = inputString("Enter IsActive:");
                    int customerIDForTicket = inputInteger("Enter CustomerID:");
                    int supportSpecialistForTicket = inputInteger("Enter SupportSpecialist:ID:");
                    CustomerServiceData.tiketsList.add(new Tiket(ticketId, ticketServiceName, problemDescription, active, customerIDForTicket, supportSpecialistForTicket));
                    schemeForTicket.addTicketToCustomerAndSupportSpecialist(ticketId, supportSpecialistForTicket, customerIDForTicket);
                    break;
                case 5:
                    for (Customer customer : CustomerServiceData.customerList) {
                        System.out.println(customer.toString());
                        schemeForProfile.allItemByCustomerID(customer.getId());
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
                        schemeForProfile.allItemBySpecialistID(supportSpecialist.getId());
                        for (Integer tiket : supportSpecialist.getlistTiket()) {
                            schemeForTicket.allItemByID(tiket);
                        }
                    }
                    break;
                case 8:
                    for (Profile profile : CustomerServiceData.profileList) {
                        System.out.println(profile.toString());
                        schemeForCustomer.allItemByID(profile.getCustomerID());
                        schemeForSupportSpecialist.allItemByID(profile.getSupportSpecialistID());
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
                default:
                    System.out.println("Wrong input");
            }
            System.out.println("Press any number");
        } while (!scanner.next().equals("exit"));
    }

    //    public static Profile createProfile(int idCustomer, int idSupportSpecialist){
//
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter ProfileID:");
//        int profileIDSupportSpecialist = scanner.nextInt();
//        System.out.println("Enter FirstName:");
//        String firstNameSupportSpecialist = scanner.next();
//        System.out.println("Enter LastName:");
//        String lastNameSupportSpecialist = scanner.next();
//        System.out.println("Enter email:");
//        String emailSupportSpecialist = scanner.next();
//        System.out.println("Enter PhoneNumber:");
//        String phoneNumberSupportSpecialist = scanner.next();
//        System.out.println("Enter Address:");
//        String addressSupportSpecialist = scanner.next();
//        System.out.println("Enter PostalCode:");
//        String postalCodeSupportSpecialist = scanner.next();
//        return new Profile(profileIDSupportSpecialist,firstNameSupportSpecialist,lastNameSupportSpecialist,emailSupportSpecialist,phoneNumberSupportSpecialist,addressSupportSpecialist,postalCodeSupportSpecialist,idCustomer);
//    }

    public static Integer inputInteger(String string) {
        System.out.println(string);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String inputString(String string) {
        System.out.println(string);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
