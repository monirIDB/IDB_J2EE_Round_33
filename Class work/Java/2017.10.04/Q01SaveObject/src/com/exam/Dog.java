/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.io.Serializable;

/**
 *
 * @author Teacher
 */
public class Dog implements Serializable{

    private String name;
    private String color;
    private String food;

    public Dog() {
    }

    public Dog(String name, String color, String food) {
        this.name = name;
        this.color = color;
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String spciality() {
        return "This is local dog";
    }

    @Override
    public String toString() {
        return  "name is " + name + ", color=" + color + ", food=" + food + '}';
    }
    
    
    
}
