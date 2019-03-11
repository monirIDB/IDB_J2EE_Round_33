
package com.book;

import java.io.Serializable;


public class Book implements Serializable{
    int id;
    int nctbId;
    double prise;
    String adition;
    String name;
    String authrName;
    String writerName;
    String publisher;
    String publishingDate;
    int pageNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNctbId() {
        return nctbId;
    }

    public void setNctbId(int nctbId) {
        this.nctbId = nctbId;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String getAdition() {
        return adition;
    }

    public void setAdition(String adition) {
        this.adition = adition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthrName() {
        return authrName;
    }

    public void setAuthrName(String authrName) {
        this.authrName = authrName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public Book(int id, int nctbId, double prise, String adition, String name, String authrName, String writerName, String publisher, String publishingDate, int pageNum) {
        this.id = id;
        this.nctbId = nctbId;
        this.prise = prise;
        this.adition = adition;
        this.name = name;
        this.authrName = authrName;
        this.writerName = writerName;
        this.publisher = publisher;
        this.publishingDate = publishingDate;
        this.pageNum = pageNum;
    }

    public Book() {
    }
}
