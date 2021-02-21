package com.java_essential.Cherednichenko.extra_task.CustomerService;

import java.io.FileWriter;
import java.io.IOException;

public class SupportService {
    Customer[] customers = new Customer[10];
    Profile[] profiles = new Profile[13];
    Service[] services = new Service[5];
    SupportSpecialist[] supportSpecialists = new SupportSpecialist[3];
    Tiket[] tikets = new Tiket[10];

    public static void main(String[] args) {

    }

    public void fetch_all_customers() {
        for (int i = 0; i <= customers.length - 1; i++) {
            System.out.println("Customer " + customers[i].getUsername());
            for (int j = 0; j <= profiles.length - 1; j++) {
                if (customers[i].getProfileID() == profiles[j].getId()) {
                    System.out.println("Profile: " + profiles[j].getFirstName());
                }
            }
        }
    }

    public void fetch_all_tikets() {
        for (int i = 0; i <= tikets.length - 1; i++) {
            System.out.println("Ticket " + tikets[i].getProblemDescription());
            for (int j = 0; j <= customers.length - 1; j++) {
                if (tikets[i].getCustomerID() == customers[j].getId()) {
                    System.out.println("Customer: " + customers[j].getUsername());
                }
            }
        }
    }

    public void fetch_all_specialists() {
        for (int i = 0; i <= supportSpecialists.length - 1; i++) {
            System.out.println("SupportSpecialists: " + supportSpecialists[i].getUserName());
            for (int j = 0; j <= profiles.length - 1; j++) {
                if (supportSpecialists[i].getProfileID() == profiles[j].getId()) {
                    System.out.println("Profile: " + profiles[j].getFirstName());
                }
            }
            for (Integer tiket : supportSpecialists[i].get_listTiket()) {
                for (int k = 0; k <= tikets.length - 1; k++) {
                    if (tiket == tikets[k].getId()) {
                        System.out.println("Ticket: " + tikets[k].getProblemDescription());
                    }
                }
            }
        }
    }

    public void feth_all_profiles() {
        for (int i = 0; i <= profiles.length - 1; i++) {
            System.out.println("Profile: " + profiles[i].getFirstName());
            for (int j = 0; j <= customers.length - 1; j++) {
                if (profiles[i].getId() == customers[j].getProfileID()) {
                    System.out.println("Customer: " + customers[j].getUsername());
                }
            }
        }
    }

    public void feth_all_services() {
        for (int i = 0; i <= services.length - 1; i++) {
            System.out.println("Servive: " + services[i].getServiceName());
            for (Integer services : services[i].get_listCustomer()) {
                for (int k = 0; k <= customers.length - 1; k++) {
                    if (services == customers[k].getId()) {
                        System.out.println("Customer: " + customers[k].getUsername());
                    }
                }
            }
        }
    }

    public void save_tiket_to_file(int tickedId) throws IOException {
        FileWriter writer = new FileWriter("Ticket_" + tickedId + ".txt", false);
        for (int i = 0; i <= tikets.length - 1; i++) {
            if (tikets[i].getId() == tickedId) {
                for (int k = 0; k <= customers.length - 1; k++) {
                    if (tikets[i].getCustomerID() == customers[k].getId()) {
                        writer.write(customers[k].getUsername());
                    }
                }
                for (int j = 0; j <= supportSpecialists.length - 1; j++) {
                    if (tikets[i].getSupportSpecialistID() == supportSpecialists[j].getId()) {
                        writer.write(supportSpecialists[j].getUserName());
                    }
                }
            }
        }
        writer.flush();
    }

}



