package com.java_essential.diledsys.homeWork.webSupport;

import java.io.IOException;

public class Mode {

    public static void modes(String mode) throws IOException {

        switch (mode) {

            case "h": {
                System.out.println(Manual.help);
            }
            break;
            case "--nc":
                Entries.init("nc");
                break;
            case "--addp":
                Entries.init("addp");
                break;
            case "--addserv":
                Entries.init("addserv");
                break;
            case "--addsp":
                Entries.init("addsp");
                break;
            case "--addticket":
                Entries.init("addticket");
                break;
            case "fetch_all_customers":
                ControlBase.allCustomer();
                break;
            case "fetch_all_tikets":
                ControlBase.allTikets();
                break;
            case "fetch_all_specialists":
                ControlBase.allSpicialist("0");
                break;
            case "feth_all_profiles":
                    ControlBase.allProfile();
                break;
            case "feth_all_services":
                    ControlBase.allService();
                break;


            case "save_tiket_to_file_{id}":
                Files.save();
                break;
            default:
                System.out.println(Manual.help);
        }
    }
}
