
package com.exam;

import java.io.Serializable;


public class Dog implements Serializable{
    String color;
    String name;
    String food;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Dog(String color, String name, String food) {
        this.color = color;
        this.name = name;
        this.food = food;
    }

    public Dog() {
    }
    public String speciality(){
        return "This is a local dog";
    }
}
