package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone myPhone;
        myPhone = new CellPhone(); //creates a cellphone object

        //User enters serial number 123
        myPhone.setSerialNumber(123);

        int serialNumber = myPhone.getSerialNumber();
        System.out.println("serial number: " + serialNumber);

        //Phone model
        myPhone.setModel("Samsung S26 Ultra");

        String model = myPhone.getModel();
        System.out.println("Model: " + model);

        //Phone carrier
        myPhone.setCarrier("T-Mobile");

        String carrier = myPhone.getCarrier();
        System.out.println("Carrier: " + carrier);

        //Phone number
        myPhone.setPhoneNumber("516-344-6479");

        String PhoneNumber = myPhone.getPhoneNumber();
        System.out.println("Phone number: " + PhoneNumber);

        //Phone Owner
        myPhone.setOwner("Chioma");

        String owner = myPhone.getOwner();
        System.out.println("Owner: " + owner);


    }
}
