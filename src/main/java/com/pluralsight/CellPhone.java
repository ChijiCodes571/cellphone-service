package com.pluralsight;

public class CellPhone {

    //Fields
    int serialNumber; //stores the cellphone cerial number
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    //Constructor
    public CellPhone() {
        this.serialNumber = 0;//whenever new Cellphone object is created, the constructor runs and sets the serial num to 0
        this.model = " ";
        this.carrier = " ";
        this.phoneNumber = " ";
        this.owner = " ";
    }

    // Serial Number
    public void setSerialNumber (int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber () {
        return this.serialNumber;
    }

    //Model
    public void setModel(String model){
        this.model = model;
    }

    public String getModel () {
        return this.model;
    }

    //carrier
    public void setCarrier(String carrier){
        this.model = carrier;
    }

    public String getCarrier () {
        return this.carrier;
    }

    //Phone Number
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    //Owner
    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner () {
        return this.owner;
    }
}
