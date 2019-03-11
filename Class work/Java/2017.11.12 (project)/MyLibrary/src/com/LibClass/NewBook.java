
package com.LibClass;

import java.util.Date;


public class NewBook {
    int id;
    String name;
    String subject;
    String edition;
    String version;
    String type;
    String shelf;
    String publisher;
    Float price;
    Date date;
    String source;
    int confidential;
    int general;
    Float fee;

    public NewBook() {
    }

    public NewBook(int id, String name, String subject, String edition, String version, String type, String shelf, String publisher, Float price, Date date, String source, int confidential, int general, Float fee) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.edition = edition;
        this.version = version;
        this.type = type;
        this.shelf = shelf;
        this.publisher = publisher;
        this.price = price;
        this.date = date;
        this.source = source;
        this.confidential = confidential;
        this.general = general;
        this.fee = fee;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getConfidential() {
        return confidential;
    }

    public void setConfidential(int confidential) {
        this.confidential = confidential;
    }

    public int getGeneral() {
        return general;
    }

    public void setGeneral(int general) {
        this.general = general;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
    }
}
