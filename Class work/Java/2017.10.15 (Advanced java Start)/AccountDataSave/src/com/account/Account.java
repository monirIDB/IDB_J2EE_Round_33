
package com.account;

public class Account {
    private int accNumber;
    private String accType;
    private String ownerName;
    private String address;
    private String nName;
    private Double monAmount;

    public Account() {
    }

    public Account(int accNumber) {
        this.accNumber = accNumber;
    }

    public Account(int accNumber, String accType) {
        this.accNumber = accNumber;
        this.accType = accType;
    }
    
    public Account(int accNumber, String accType, String ownerName, String address, String nName, Double monAmount) {
        this.accNumber = accNumber;
        this.accType = accType;
        this.ownerName = ownerName;
        this.address = address;
        this.nName = nName;
        this.monAmount = monAmount;
    }

    public Double getMonAmount() {
        return monAmount;
    }

    public void setMonAmount(Double monAmount) {
        this.monAmount = monAmount;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

   
    
    
}
