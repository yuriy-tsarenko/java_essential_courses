package com.javae_ssential.diledsys.homeWork.webSupport;

import java.io.IOException;

public class Entries {

    public static void init(String mode) throws IOException {
        Entries entries = new Entries();
        String idC;
        if (mode.equals("nc")) {
            entries.newUserData(new Customer());
        }
        //
        if (mode.equals("addp")) {
            idC = InputLowerCase.input("enter id Customer: ");
            if (!idC.equals("")){
            String idP = entries.profiles(idC);
            entries.findPersonInBase(idP,idC,"Customer");
            }}
        //
        if (mode.equals("addsp")) {
            entries.newUserData(new SupportSpecialist());
        }
        //
        if (mode.equals("addserv")){
            entries.newService();
        }
        if (mode.equals("addticket")){
            idC = InputLowerCase.input("enter id Customer: ");

            if (!idC.equals("")) {
                entries.newTicket(idC);
            }
        }
    }
    private void findPersonInBase(String idP, String idC, String type) throws IOException {
        for (UserData userData : DataB.inquiry(type)) {
            if (userData.getId().equals(idC)) {
                userData.setProfileId(idP);
                System.out.println("naiden");
                Serialize.serializable(userData, userData.getId());
            }
        }
    }

    public void newUserData(UserData userData) throws IOException {
        userData.setId(NextId.getLastId());
        userData.setUserName(InputLowerCase.input("login: "));
        userData.setPassWord(InputLowerCase.input("passWord: "));
        if (userData.getIdService()!=null){
        if (InputLowerCase.input("add a service? \n" +
                " continue..? y or n").equals("n")) {
            userData.getIdService().add("0");}
        else {
            System.out.println("list of valid services \n --------------------");// список допустимых сервисов
            ControlBase.allService();
            while (true) {
                String modeServ = InputLowerCase.input("choose service by id: ");
                if (modeServ.equals("")) break;
                userData.getIdService().add(modeServ);
            }
        }
        }
        if (InputLowerCase.input("more data about the user \n" +
                " continue..? y or n").equals("n")) {
            userData.setProfileId("0");
        } else {
            userData.setId(String.valueOf(Integer.parseInt(userData.getId()) + 1));
            userData.setProfileId(profiles(userData.getId())); //id profil и записываем в profile id
        }
        Serialize.serializable(userData, userData.getId());
    }

    public String profiles(String idCustumer) throws IOException {  //add profile
        Profile profile = new Profile();
        profile.setFirstName(InputLowerCase.input("First name: "));
        profile.setLastName(InputLowerCase.input("Last name: "));
        profile.setAddress(InputLowerCase.input("Address: "));
        profile.setEmail(InputLowerCase.input("email: "));
        profile.setPhoneNumber(InputLowerCase.input("phone namber: "));
        profile.setPostalCode(InputLowerCase.input("postal code:"));
        profile.setId(NextId.getLastId());
        profile.setCustomerID(idCustumer);

        Serialize.serializable(profile, profile.getId());
        return profile.getId();
    }
    public void newService() throws IOException { //add service new
        Service service = new Service();
        service.setId(NextId.getLastId());
        service.setServiceName(InputLowerCase.input("Name Service: "));
        service.setServiceMonthPrice(InputLowerCase.input("Price List:"));
        service.setActive(true);
        Serialize.serializable(service,service.getId());
    }
    public void newTicket(String customer) throws IOException {
        Tiket tiket = new Tiket();
        tiket.setId(NextId.getLastId());
        tiket.setCustomerID(customer);
        tiket.setIsActive(true);
        tiket.setServiceName(InputLowerCase.input("Service name: "));
        tiket.setProblemDescription(InputLowerCase.input("Descriptions of the problem: "));
       while (true) {
           String idSupprt = InputLowerCase.input("id Support Specialist: ");
           if (idSupprt.equals("q"))break;
           if (ControlBase.allSpicialist(idSupprt)) {
               tiket.setSupportSpecialistID(idSupprt);
               break;
           }
           System.out.println("there is no such specialist, q - exit");
       }
       tiket.setCustomerID(customer);
        Serialize.serializable(tiket,tiket.getId());
    }
}
