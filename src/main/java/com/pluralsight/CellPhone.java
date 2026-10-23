package com.pluralsight;

public class CellPhone {

    //Fields
    int serialNumber;

    //Constructor
    public CellPhone() {
        this.serialNumber = 0;
    }

    public void setSerialNumber (int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber () {
        return this.serialNumber;
    }
}
