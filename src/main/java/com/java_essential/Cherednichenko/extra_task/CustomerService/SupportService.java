package com.java_essential.Cherednichenko.extra_task.CustomerService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SupportService {


    public static void main(String[] args) throws IOException {
        Customer[] customers = new Customer[10];
        Profile[] profiles = new Profile[13];
        Service[] services = new Service[5];
        SupportSpecialist[] supportSpecialists = new SupportSpecialist[3];
        Tiket[] tikets = new Tiket[10];
        System.out.println("Please select a feature: ");
        System.out.println("#fetch_all_customers - 1");
        System.out.println("#fetch_all_tikets - 2");
        System.out.println("#fetch_all_specialists - 3");
        System.out.println("#feth_all_profiles - 4");
        System.out.println("#feth_all_services - 5");
        System.out.println("#save_tiket_to_file_{id} - 6");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "1":
                AllCustomers all_customers = new AllCustomers(customers, profiles);
                all_customers.fetchAllCustomers();
                break;
            case "2":
                AllTikets all_tikets = new AllTikets(tikets, customers);
                all_tikets.fetchAllTtikets();
                break;
            case "3":
                AllSpecialists all_specialists = new AllSpecialists(supportSpecialists, tikets, profiles);
                all_specialists.fetchAllSpecialists();
                break;
            case "4":
                AllProfiles all_profiles = new AllProfiles(customers, profiles);
                all_profiles.fethAllProfiles();
                break;
            case "5":
                AllServices all_services = new AllServices(services, customers);
                all_services.fethAllServices();
                break;
            case "6":
                System.out.println("Select ticket ID:");
                SaveTiket save_tiket = new SaveTiket(tikets, customers, supportSpecialists);
                save_tiket.saveTiketTFile(scanner.nextInt());
                break;
            default:
                System.out.println("Try again");
                break;
        }
    }


    public static class AllCustomers {
        private final Customer[] customers;
        private final Profile[] profiles;

        public AllCustomers(Customer[] customers, Profile[] profiles) {
            this.customers = customers;
            this.profiles = profiles;
        }

        public void fetchAllCustomers() {
            for (int i = 0; i <= customers.length - 1; i++) {
                System.out.println(customers[i].toString());
                for (int j = 0; j <= profiles.length - 1; j++) {
                    if (customers[i].getProfileID() == profiles[j].getId()) {
                        System.out.println(profiles[j].toString());
                    }
                }
            }
        }
    }

    public static class AllTikets {
        private final Tiket[] tikets;
        private final Customer[] customers;

        public AllTikets(Tiket[] tikets, Customer[] customers) {
            this.tikets = tikets;
            this.customers = customers;
        }

        public void fetchAllTtikets() {
            for (int i = 0; i <= tikets.length - 1; i++) {
                System.out.println(tikets[i].toString());
                for (int j = 0; j <= customers.length - 1; j++) {
                    if (tikets[i].getCustomerID() == customers[j].getId()) {
                        System.out.println("Customer: " + customers[j].toString());
                    }
                }
            }
        }
    }

    public static class AllSpecialists {
        private final SupportSpecialist[] supportSpecialists;
        private final Tiket[] tikets;
        private final Profile[] profiles;

        public AllSpecialists(SupportSpecialist[] supportSpecialists, Tiket[] tikets, Profile[] profiles) {
            this.supportSpecialists = supportSpecialists;
            this.tikets = tikets;
            this.profiles = profiles;
        }

        public void fetchAllSpecialists() {
            for (int i = 0; i <= supportSpecialists.length - 1; i++) {
                System.out.println(supportSpecialists[i].toString());
                for (int j = 0; j <= profiles.length - 1; j++) {
                    if (supportSpecialists[i].getProfileID() == profiles[j].getId()) {
                        System.out.println(profiles[j].toString());
                    }
                }
                for (Integer tiket : supportSpecialists[i].getlistTiket()) {
                    for (int k = 0; k <= tikets.length - 1; k++) {
                        if (tiket == tikets[k].getId()) {
                            System.out.println(tikets[k].toString());
                        }
                    }
                }
            }
        }
    }

    public static class AllProfiles {
        private final Customer[] customers;
        private final Profile[] profiles;

        public AllProfiles(Customer[] customers, Profile[] profiles) {
            this.customers = customers;
            this.profiles = profiles;
        }

        public void fethAllProfiles() {
            for (int i = 0; i <= profiles.length - 1; i++) {
                System.out.println(profiles[i].toString());
                for (int j = 0; j <= customers.length - 1; j++) {
                    if (profiles[i].getId() == customers[j].getProfileID()) {
                        System.out.println(customers[j].toString());
                    }
                }
            }
        }
    }

    public static class AllServices {
        private final Service[] services;
        private final Customer[] customers;

        public AllServices(Service[] services, Customer[] customers) {
            this.services = services;
            this.customers = customers;
        }

        public void fethAllServices() {
            for (int i = 0; i <= services.length - 1; i++) {
                System.out.println(services[i].toString());
                for (Integer services : services[i].getlistCustomer()) {
                    for (int k = 0; k <= customers.length - 1; k++) {
                        if (services == customers[k].getId()) {
                            System.out.println(customers[k].toString());
                        }
                    }
                }
            }
        }
    }

    public static class SaveTiket {
        private final Tiket[] tikets;
        private final Customer[] customers;
        private final SupportSpecialist[] supportSpecialists;

        public SaveTiket(Tiket[] tikets, Customer[] customers, SupportSpecialist[] supportSpecialists) {
            this.tikets = tikets;
            this.customers = customers;
            this.supportSpecialists = supportSpecialists;
        }

        public void saveTiketTFile(int tickedId) throws IOException {
            FileWriter writer = new FileWriter("Ticket_" + tickedId + ".txt", false);
            for (int i = 0; i <= tikets.length - 1; i++) {
                if (tikets[i].getId() == tickedId) {
                    for (int k = 0; k <= customers.length - 1; k++) {
                        if (tikets[i].getCustomerID() == customers[k].getId()) {
                            writer.write(customers[k].toString());
                        }
                    }
                    for (int j = 0; j <= supportSpecialists.length - 1; j++) {
                        if (tikets[i].getSupportSpecialistID() == supportSpecialists[j].getId()) {
                            writer.write(supportSpecialists[j].toString());
                        }
                    }
                }
            }
            writer.flush();
        }
    }
}



