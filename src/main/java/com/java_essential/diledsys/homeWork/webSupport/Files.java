package com.java_essential.diledsys.homeWork.webSupport;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {

   public static void save() throws IOException {
      String idTiket= InputLowerCase.input("Enter id tiket");
      FileOutputStream fos= new FileOutputStream(new File("resBase\\" + "tiket" + ".txt"));

      for (UserData tiket : DataB.inquiry("Tiket")){
         if (tiket.getId().equals(idTiket)){
            fos.write(tiket.toString().getBytes());
            for (UserData customer : DataB.inquiry("Customer")){
               if (tiket.getCustomerID().equals(customer.getId())){
                  fos.write(customer.toString().getBytes());
               }
            }
            for (UserData support : DataB.inquiry("SupportSpecialist")){
               if(tiket.getSupportSpecialistID().equals(support.getId())){
                  fos.write(support.toString().getBytes());
               }
            }
         }
      }
      System.out.println("save.");
   }

   public  static void load(){


   }
}
