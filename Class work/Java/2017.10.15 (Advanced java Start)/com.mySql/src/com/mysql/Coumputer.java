
package com.mysql;


public class Coumputer {
    int id;
    String name;
    String brandName;
    int prise;

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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public Coumputer(int id, String name, String brandName, int prise) {
        this.id = id;
        this.name = name;
        this.brandName = brandName;
        this.prise = prise;
    }

    public Coumputer() {
    }
    
}
