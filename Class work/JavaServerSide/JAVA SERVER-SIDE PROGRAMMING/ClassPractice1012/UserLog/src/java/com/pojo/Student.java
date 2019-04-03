/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

/**
 *
 * @author Ariful Islam Khokon
 */
public class Student {
   private int id;
   private String name;
   private String gender;
   private String subject;
   private String round;

    public Student() {
    }

    public Student(int id, String name, String gender, String subject, String round) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.subject = subject;
        this.round = round;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
   
}
