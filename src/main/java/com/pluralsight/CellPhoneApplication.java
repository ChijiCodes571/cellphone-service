package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone myPhone;
        myPhone = new CellPhone();

        //User enters serial number 123
        myPhone.setSerialNumber(123);

        int serialNumber = myPhone.getSerialNumber();
        System.out.println("serial number: " + serialNumber);
    }
}
