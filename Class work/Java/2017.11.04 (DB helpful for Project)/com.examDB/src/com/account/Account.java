
package com.account;


public class Account {
    int id;
    String name;
    String type;
    String branch;
    float balance;

    public Account() {
    }

    public Account(int id) {
        this.id = id;
    }

    public Account(int id, String name, String type, String branch, float balance) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.branch = branch;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
}
