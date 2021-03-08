package com.javae_ssential.diledsys.homeWork.webSupport;

import java.io.Serializable;
import java.util.List;

public class Profile implements Serializable, UserData {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String postalCode;
    private String customerID;

    @Override
    public String getProfileId() {
        return null;
    }

    @Override
    public void setProfileId(String profileId) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public void setUserName(String userName) {

    }

    @Override
    public String getPassWord() {
        return null;
    }

    @Override
    public void setPassWord(String passWord) {

    }

    @Override
    public List<String> getIdTicket() {
        return null;
    }

    @Override
    public List<String> getIdService() {
        return null;
    }

    @Override
    public String getServiceName() {
        return null;
    }

    @Override
    public void setServiceName(String serviceName) {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setActive(boolean active) {

    }

    @Override
    public String getServiceMonthPrice() {
        return null;
    }

    @Override
    public void setServiceMonthPrice(String serviceMonthPrice) {

    }

    @Override
    public String getIdCustomer() {
        return null;
    }

    @Override
    public void setIdCustomer(String idCustomer) {

    }

    @Override
    public String getProblemDescription() {
        return null;
    }

    @Override
    public void setProblemDescription(String problemDescription) {

    }

    @Override
    public boolean getIsActive() {
        return false;
    }

    @Override
    public void setIsActive(boolean isActive) {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String getSupportSpecialistID() {
        return null;
    }

    @Override
    public void setSupportSpecialistID(String supportSpecialistID) {

    }

    @Override
    public String toString() {
        return "Profile" +"\n" +
                "id: " + id + "\n" +
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "email: " + email + "\n" +
                "phone number: " + phoneNumber + "\n" +
                "address: " + address + "\n" +
                "postal node: " + postalCode; //+ "\n" +
                //"customerID: " + customerID + "\n";
    }
}
